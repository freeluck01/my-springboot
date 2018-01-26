package com.xm.springboot.controller;

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

    @RequestMapping("/helloworld")
    public String helloworld(){
        return "helloworld";
    }
}
