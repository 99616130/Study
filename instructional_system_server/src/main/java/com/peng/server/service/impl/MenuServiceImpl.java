package com.peng.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peng.server.mapper.MenuMapper;
import com.peng.server.pojo.Admin;
import com.peng.server.pojo.Menu;
import com.peng.server.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Peng
 * @since 2021-02-21
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    //根据用户id查询菜单
    @Override
    public List<Menu> getMenusByAdminId() {
        System.out.println(((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
        return menuMapper.getMenusByAdminId(String.valueOf((((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId())));
    }
}
