package com.peng.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peng.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Peng
 * @since 2021-02-21
 */
public interface MenuMapper extends BaseMapper<Menu> {

    //根据用户id查询
    List<Menu> getMenusByAdminId(String id);
}
