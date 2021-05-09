package com.peng.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peng.server.pojo.Sysclass;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Peng
 * @since 2021-03-17
 */
public interface ISysclassService extends IService<Sysclass> {

    //查询所有班级
    List<Sysclass> getAllClass();
}
