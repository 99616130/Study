package com.peng.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peng.server.mapper.ScheduleMapper;
import com.peng.server.pojo.Admin;
import com.peng.server.pojo.RespBean;
import com.peng.server.pojo.Schedule;
import com.peng.server.service.IScheduleService;
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
 * @since 2021-03-16
 */
@Service
public class ScheduleServiceImpl extends ServiceImpl<ScheduleMapper, Schedule> implements IScheduleService {

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public List<Schedule> getScheduleServiceByAdminId() {
        System.out.println(((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
        return scheduleMapper.getScheduleServiceByAdminId(String.valueOf((((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId())));
    }


    //添加课程
//    @Override
//    public RespBean addSche(Schedule sche) {
//        scheduleMapper.addSche(sche);
//        System.out.println("开始打印"+scheduleMapper.toString());
//        return null;
//    }
}
