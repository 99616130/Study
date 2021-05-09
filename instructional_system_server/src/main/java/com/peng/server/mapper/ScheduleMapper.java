package com.peng.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peng.server.pojo.Schedule;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Peng
 * @since 2021-03-16
 */
public interface ScheduleMapper extends BaseMapper<Schedule> {

    List<Schedule> getScheduleServiceByAdminId(String id);

    //添加部门
//    void addSche(Schedule sche);
}
