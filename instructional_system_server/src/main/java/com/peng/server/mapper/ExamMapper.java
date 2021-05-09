package com.peng.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peng.server.pojo.Exam;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Peng
 * @since 2021-05-08
 */
public interface ExamMapper extends BaseMapper<Exam> {

    //查询所有考场
    List<Exam> getExamServiceByAdminId(String valueOf);
}
