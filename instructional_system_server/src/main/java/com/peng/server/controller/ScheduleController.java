package com.peng.server.controller;


import com.peng.server.pojo.RespBean;
import com.peng.server.pojo.Schedule;
import com.peng.server.service.IScheduleService;
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
 * @since 2021-03-16
 */
@RestController
@RequestMapping("course/coursemanage")
public class ScheduleController {

    @Autowired
    private IScheduleService scheduleService;

//    private List<Schedule> jie1;

    @ApiOperation(value = "查询课表信息")
    @GetMapping("/")
    public List<Schedule> getScheduleServiceByAdminId(){
//        for(int i=1;i<=7;i++){
//            jie1.set(i,scheduleService.getScheduleServiceByAdminId());
//        }
        System.out.println(scheduleService.getScheduleServiceByAdminId());
        //返回课表信息
        return scheduleService.getScheduleServiceByAdminId();
    }

    @ApiOperation(value = "获取最大id")
    @GetMapping("/maxScID")
    public RespBean maxScID() {
        return scheduleService.maxScID();
    }

    @ApiOperation(value = "添加课程")
    @PostMapping("/")
    public RespBean addSche(@RequestBody Schedule Sche){
        //添加时间
        //Sch.
        //        if(1==Sche.getResult()){

        if(scheduleService.save(Sche)){
            return RespBean.success("添加成功",Sche);
        }
        return RespBean.error("添加失败");
    }

    @ApiOperation(value = "更新课表")
    @PutMapping("/")
    public RespBean updateSche(@RequestBody Schedule Sche){
        if(scheduleService.updateById(Sche)){
            return RespBean.success("更新成功");
        }
        return RespBean.error("更新失败");
    }

    @ApiOperation(value="删除课程")
    @DeleteMapping("/{id}")
    public RespBean delectSche(@PathVariable Integer id){
        if(scheduleService.removeById(id)){
            return RespBean.success("删除成功",id);
        }
        return RespBean.error("删除失败");
    }

    //备用
    @ApiOperation(value = "批量删除")
    @DeleteMapping("/")
    public RespBean delectSches(Integer[] sid){
        if (scheduleService.removeByIds(Arrays.asList(sid))){
            return RespBean.success("删除成功");
        }
        return RespBean.error("删除失败");
    }
}
