package com.peng.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peng.server.pojo.Student;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Peng
 * @since 2021-03-08
 */
public interface IStudentService extends IService<Student> {

    //查询所有学生
    List<Student> getAllStudent();
}
