package com.peng.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.peng.server.mapper.SysclassMapper;
import com.peng.server.pojo.Sysclass;
import com.peng.server.service.ISysclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Peng
 * @since 2021-03-17
 */
@Service
public class SysclassServiceImpl extends ServiceImpl<SysclassMapper, Sysclass> implements ISysclassService {

    @Autowired
    private SysclassMapper sysclassMapper;
    //查询所有班级
    @Override
    public List<Sysclass> getAllClass() {
        return sysclassMapper.selectByMap(null);
    }
}
