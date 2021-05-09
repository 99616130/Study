package com.peng.server.controller;


import com.peng.server.pojo.Teacher;
import com.peng.server.service.ITeacherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Peng
 * @since 2021-03-11
 */
@RestController
@RequestMapping("//teacher")
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    @ApiOperation(value = "查询教师")
    @GetMapping("/get")
    public List<Teacher> getAllTeacher(){
        return teacherService.getAllTeacher();
    }

}
