package com.peng.server.controller;


import com.peng.server.pojo.RespBean;
import com.peng.server.pojo.Result;
import com.peng.server.pojo.Schedule;
import com.peng.server.service.IResultService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Peng
 * @since 2021-03-08
 */
@RestController
@RequestMapping("//exam/grademanage/")
public class ResultController {
    @Autowired
    private IResultService resultServicet;

    @ApiOperation(value = "查询成绩")
    @GetMapping("/")
    public List<Result> getResultByAdminId(){
        return resultServicet.getResultByAdminId();
    }

    @ApiOperation(value = "添加成绩")
    @PostMapping("/")
    public RespBean addResultByAdminId(@RequestBody Result result){
        if(resultServicet.save(result)){
            return RespBean.success("添加成功",result);
        }
        return RespBean.error("添加失败");
    }

    @ApiOperation(value = "删除成绩")
    @DeleteMapping("/{id}")
    public RespBean delectResult(@PathVariable Integer id){
        if(resultServicet.removeById(id)){
            return RespBean.success("删除成功",id);
        }
        return RespBean.error("删除失败");
    }

    @ApiOperation(value = "更新成绩")
    @PutMapping("/")
    public RespBean updateResult(@RequestBody Result result){
        if(resultServicet.updateById(result)){
            return RespBean.success("更新成功");
        }
        return RespBean.error("更新失败");
    }

}
