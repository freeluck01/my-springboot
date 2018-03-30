package com.xm.springboot.service.impl;

import com.xm.springboot.domain.Demo;
import com.xm.springboot.mapper.DemoMapper;
import com.xm.springboot.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author: caoxingming
 * date: 2018/3/30
 * time: 17:38
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
@Service
public class DemoServiceImpl implements IDemoService {
    @Autowired
    DemoMapper demoMapper;

    public Demo selectOne(Demo demo){
        Demo dd = demoMapper.selectOne(demo);
        return dd;
    }
}
