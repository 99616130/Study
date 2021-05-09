package com.peng.server.controller;


import com.peng.server.pojo.Student;
import com.peng.server.pojo.Teacher;
import com.peng.server.service.IStudentService;
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
 * @since 2021-02-10
 */
@RestController
@RequestMapping("//student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @ApiOperation(value = "查询学生")
    @GetMapping("/get")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
}
