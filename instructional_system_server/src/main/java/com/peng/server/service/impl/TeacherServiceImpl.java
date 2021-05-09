package com.peng.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peng.server.mapper.TeacherMapper;
import com.peng.server.pojo.Teacher;
import com.peng.server.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Peng
 * @since 2021-03-11
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements ITeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    //查询所有教师
    @Override
    public List<Teacher> getAllTeacher() {
        return teacherMapper.selectByMap(null);
    }
}
