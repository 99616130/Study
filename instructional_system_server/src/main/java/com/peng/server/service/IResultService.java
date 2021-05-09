package com.peng.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peng.server.pojo.Result;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Peng
 * @since 2021-03-08
 */
public interface IResultService extends IService<Result> {

    //查询成绩
    List<Result> getResultByAdminId();
}
