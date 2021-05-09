package com.peng.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peng.server.pojo.Course;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Peng
 * @since 2021-03-08
 */
public interface CourseMapper extends BaseMapper<Course> {

    //获取所有课程
    List<Course> getAllCourses();
}
