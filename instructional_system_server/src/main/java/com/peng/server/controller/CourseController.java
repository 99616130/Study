package com.peng.server.controller;


import com.peng.server.pojo.Course;
import com.peng.server.service.ICourseService;
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
@RequestMapping("//course")
public class CourseController {

    @Autowired
    private ICourseService curseService;

    //查询课程
    @ApiOperation(value = "查询课程")
    @GetMapping("/cx")
    public List<Course> getAllCourses(){
        return curseService.getAllCourses();
    }

}
