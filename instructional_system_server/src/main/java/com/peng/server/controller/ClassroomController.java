package com.peng.server.controller;


import com.peng.server.pojo.Classroom;
import com.peng.server.pojo.Teacher;
import com.peng.server.service.IClassroomService;
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
 * @since 2021-05-16
 */
@RestController
@RequestMapping("//classroom")
public class ClassroomController {

    @Autowired
    private IClassroomService classroomService;

    @ApiOperation(value = "查询教室")
    @GetMapping("/get")
    public List<Classroom> getAllRoom(){
        return classroomService.getAllRoom();
    }
}
