package com.xm.springboot.ExceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常处理器
 * author: caoxingming
 * date: 2018/3/21
 * time: 11:01
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({RuntimeException.class})
    @ResponseBody
    public Map<String, String> runtimeExceptionHandler(RuntimeException e){
        e.printStackTrace();
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorCode","500");
        errorMap.put("errorMsg","系统后台发生错误");
        return errorMap;
    }
}
