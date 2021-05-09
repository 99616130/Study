package com.peng.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peng.server.pojo.Admin;
import com.peng.server.pojo.Course;
import com.peng.server.pojo.Menu;
import com.peng.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Peng
 * @since 2021-02-14
 */
public interface IAdminService extends IService<Admin> {

    //登录之后返回token
    RespBean login(String username, String password, String code, HttpServletRequest request);

    //根据用户名获取用户
    Admin getAdminByUserName(String username);

    //获取所有用户
    List<Admin> getAllAdmins();

}
