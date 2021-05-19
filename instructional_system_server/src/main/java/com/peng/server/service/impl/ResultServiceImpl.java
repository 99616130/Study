package com.peng.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peng.server.mapper.ResultMapper;
import com.peng.server.pojo.Admin;
import com.peng.server.pojo.RespBean;
import com.peng.server.pojo.Result;
import com.peng.server.pojo.Schedule;
import com.peng.server.service.IResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Peng
 * @since 2021-03-08
 */
@Service
public class ResultServiceImpl extends ServiceImpl<ResultMapper, Result> implements IResultService {

    @Autowired
    private ResultMapper resultMapper;
    //查询成绩
    @Override
    public List<Result> getResultByAdminId() {
        return resultMapper.getResultByAdminId(String.valueOf((((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId())));
    }


    //获取最大id
    @Override
    public RespBean maxRsID() {
        List<Map<String, Object>> maps = resultMapper.selectMaps(new QueryWrapper<Result>().select("MAX(id)"));
        return RespBean.success(null,Integer.parseInt(maps.get(0).get("MAX(id)").toString())+1);

    }
}
