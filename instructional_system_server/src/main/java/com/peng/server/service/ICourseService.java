package com.peng.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peng.server.pojo.Course;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Peng
 * @since 2021-03-08
 */
public interface ICourseService extends IService<Course> {

    //获取所有课程
    List<Course> getAllCourses();
}
