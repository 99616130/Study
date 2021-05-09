package com.peng.server.controller;


import com.peng.server.pojo.Exam;
import com.peng.server.pojo.RespBean;
import com.peng.server.pojo.Schedule;
import com.peng.server.service.IExamService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Peng
 * @since 2021-05-08
 */
@RestController
@RequestMapping("//exam/examsite/")
public class ExamController {
    @Autowired
    private IExamService examService;

    @ApiOperation(value="查询考场")
    @GetMapping("/")
    public List<Exam> getExamServiceByAdminId(){
//        for(int i=1;i<=7;i++){
//            jie1.set(i,scheduleService.getScheduleServiceByAdminId());
//        }
        System.out.println(examService.getExamServiceByAdminId());
        //返回课表信息
        return examService.getExamServiceByAdminId();
    }

    @ApiOperation(value = "更新考场")
    @PutMapping("/")
    public RespBean updateExam(@RequestBody Exam exam){
        if(examService.updateById(exam)){
            return RespBean.success("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @ApiOperation(value="删除考场")
    @DeleteMapping("/{id}")
    public RespBean delectExam(@PathVariable Integer id){
        if(examService.removeById(id)){
            return RespBean.success("删除成功",id);
        }
        return RespBean.error("删除失败");
    }

    //备用
    @ApiOperation(value = "批量删除")
    @DeleteMapping("/")
    public RespBean delectExam(Integer[] sid){
        if (examService.removeByIds(Arrays.asList(sid))){
            return RespBean.success("删除成功");
        }
        return RespBean.error("删除失败");
    }
}
