package com.peng.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.peng.server.pojo.Result;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Peng
 * @since 2021-03-08
 */
public interface ResultMapper extends BaseMapper<Result> {

    //查询成绩
    List<Result> getResultByAdminId(String valueOf);
}
