package com.peng.server.controller;


import com.peng.server.pojo.Sysclass;
import com.peng.server.service.ISysclassService;
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
 * @since 2021-03-17
 */
@RestController
@RequestMapping("//sysclass")
public class SysclassController {

    @Autowired
    private ISysclassService sysclassService;

    @ApiOperation(value = "查询班级")
    @GetMapping("/class")
    public List<Sysclass> getAllClass(){
        return sysclassService.getAllClass();
    }
}
