package com.peng.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peng.server.pojo.Teacher;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Peng
 * @since 2021-03-11
 */
public interface ITeacherService extends IService<Teacher> {

    //查询所有教师
    List<Teacher> getAllTeacher();
}
