package com.dsbread.exception;

//该类用于捕获全局异常

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
/*
    @ExceptionHandler(RuntimeException.class)//捕获运行时异常
    @ResponseBody
    public Map<String,Object> exceptionHandler(){
        Map<String,Object> map=new HashMap<>();
        map.put("errorCode","500");
        map.put("errorMsg","系统错误！");
        return map;
    }
*/

}
