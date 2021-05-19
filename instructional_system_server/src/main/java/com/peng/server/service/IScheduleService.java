package com.peng.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peng.server.pojo.RespBean;
import com.peng.server.pojo.Schedule;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Peng
 * @since 2021-03-16
 */
public interface IScheduleService extends IService<Schedule> {

    List<Schedule> getScheduleServiceByAdminId();

    //获取最大id
    RespBean maxScID();

    //添加课程
//    RespBean addSche(Schedule sche);
}
