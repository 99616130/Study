package com.peng.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peng.server.mapper.ExamMapper;
import com.peng.server.pojo.Admin;
import com.peng.server.pojo.Exam;
import com.peng.server.service.IExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Peng
 * @since 2021-05-08
 */
@Service
public class ExamServiceImpl extends ServiceImpl<ExamMapper, Exam> implements IExamService {

    @Autowired
    private ExamMapper examMapper;

    //查询所有考场
    @Override
    public List<Exam> getExamServiceByAdminId() {
        System.out.println(((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
        return examMapper.getExamServiceByAdminId(String.valueOf((((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId())));
    }
}
