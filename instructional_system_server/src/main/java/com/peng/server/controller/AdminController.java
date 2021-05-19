package com.peng.server.controller;


import com.peng.server.pojo.Admin;
import com.peng.server.pojo.Course;
import com.peng.server.pojo.RespBean;
import com.peng.server.pojo.Result;
import com.peng.server.service.IAdminService;
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
 * @since 2021-02-14
 */
@RestController
@RequestMapping("//system/accountmanagemen")
public class AdminController {

    @Autowired
    private IAdminService adminService;

    //查询课程
    @ApiOperation(value = "查询用户")
    @GetMapping("/")
    public List<Admin> getAllAdmins(){
        return adminService.getAllAdmins();
    }

    @ApiOperation(value = "添加用户")
    @PostMapping("/")
    public RespBean addAdminByAdminId(@RequestBody Admin admin){
        return adminService.addAdminByAdminId(admin);
    }

    @ApiOperation(value = "获取最大id")
    @GetMapping("/maxAdminID")
    public RespBean maxAdminID() {
        return adminService.maxAdminID();
    }

    @ApiOperation(value = "删除用户")
    @DeleteMapping("/{id}")
    public RespBean delectAdmin(@PathVariable Integer id){
        if(adminService.removeById(id)){
            return RespBean.success("删除成功",id);
        }
        return RespBean.error("删除失败");
    }
}
