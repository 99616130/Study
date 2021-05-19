package com.peng.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peng.server.pojo.Admin;
import com.peng.server.pojo.Menu;
import io.swagger.v3.oas.annotations.Parameter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Peng
 * @since 2021-02-14
 */
public interface AdminMapper extends BaseMapper<Admin> {

    //通过用户id查询菜单列表
    List<Admin> getAllAdmins(Long id);



}
