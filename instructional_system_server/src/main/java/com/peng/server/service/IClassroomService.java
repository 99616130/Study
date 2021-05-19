package com.peng.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peng.server.pojo.Classroom;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Peng
 * @since 2021-05-16
 */
public interface IClassroomService extends IService<Classroom> {

    //查询教师
    List<Classroom> getAllRoom();
}
