package com.peng.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peng.server.config.security.JwtTokenUtil;
import com.peng.server.mapper.AdminMapper;
import com.peng.server.pojo.*;
import com.peng.server.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Peng
 * @since 2021-02-14
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

    //注入mapper进数据库查
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private UserDetailsService userDetailsService;

    //加密码工具
    @Autowired
    private PasswordEncoder passwordEncoder;

    //注入jwtutil
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    //通过注解拿头部信息
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    //登录之后返回token
    @Override
    public RespBean login(String username, String password, String code, HttpServletRequest request) {
        //获取一下captcha
        String captcha = (String) request.getSession().getAttribute("captcha");
        if (StringUtils.isEmpty(code) || !captcha.equalsIgnoreCase(code)) {
            return RespBean.error("验证码输入错误，请重新验证！");
        }
        //登录
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if (null == userDetails || !passwordEncoder.matches(password, userDetails.getPassword())) {
            //之前测试加密的密码
//            System.out.println(passwordEncoder.encode("123456")+passwordEncoder.encode("123"));
            return RespBean.error("用户名或密码不正确");
        }
        if (!userDetails.isEnabled()) {
            return RespBean.error("账号被禁用，请联系管理员！");
        }
        //更新登录用户对象(用户名，密码，列表权限)
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        //放进Security的全局里面
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        //生成token
        String token = jwtTokenUtil.generateToken(userDetails);
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        //返回头部信息
        tokenMap.put("tokenHead", tokenHead);

        //返回给前端网页的信息
        return RespBean.success("登录成功", tokenMap);
    }

    //根据用户名获取用户
    @Override
    public Admin getAdminByUserName(String username) {

        //看用户名和是否禁用
        return adminMapper.selectOne(new QueryWrapper<Admin>().eq("username", username).eq("enabled", true));
    }

    @Override
    public List<Admin> getAllAdmins() {

        return adminMapper.getAllAdmins(((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    //获取最大id
    @Override
    public RespBean maxAdminID() {
        List<Map<String, Object>> maps = adminMapper.selectMaps(new QueryWrapper<Admin>().select("MAX(id)"));
//        String.format("%08d",Integer.parseInt(maps.get(0).get("max(id)").toString())+1);
//        maps.get(0).get("max(id)")+1;
        return RespBean.success(null, Integer.parseInt(maps.get(0).get("MAX(id)").toString()) + 1);
    }

    //添加用户
    @Override
    public RespBean addAdminByAdminId(Admin admin) {
        String pw;
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        pw = admin.getPassword();
        System.out.println(pw);
        admin.setPassword(encoder.encode(pw));
        int result = adminMapper.insert(admin);
        if (result == 1) {

            return RespBean.success("成功添加", 0);
        }
        return RespBean.error("更新失败");
    }

    //获
    //通过用户id查询菜单列表
}