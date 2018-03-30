package com.xm.springboot.controller;

import com.xm.springboot.domain.Demo;
import com.xm.springboot.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: caoxingming
 * date: 2018/1/26
 * time: 14:32
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    IDemoService demoService;

    @RequestMapping("/helloworld")
    public String helloWorld(String arg){
        if("error".equals(arg)){
            int i= 3/0;
        }

        return "hello world";
    }

    @RequestMapping("/one/{name}")
    public Demo demo(@PathVariable String name){
        Demo d = new Demo();
        d.setName("xuanxuan");
        Demo demo = demoService.selectOne(d);
        return demo;
    }
}
