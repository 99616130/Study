package com.peng.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peng.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Peng
 * @since 2021-02-21
 */
public interface IMenuService extends IService<Menu> {
    //根据用户id查询菜单
    List<Menu> getMenusByAdminId();
}
