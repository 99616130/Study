package com.peng.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peng.server.pojo.Exam;
import com.peng.server.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Peng
 * @since 2021-05-08
 */
public interface IExamService extends IService<Exam> {

    //查询所有考场
    List<Exam> getExamServiceByAdminId();

    //获取最大工号
    RespBean maxExamID();
}
