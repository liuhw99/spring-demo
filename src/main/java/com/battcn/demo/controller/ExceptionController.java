package com.battcn.demo.controller;

import com.battcn.demo.exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: chenmingyu
 * @date: 2018/12/6 14:20
 * @description:
 */
@RestController
public class ExceptionController {

    /**
     * 抛出运行时异常
     */
    @RequestMapping("/throwRuntimeException")
    public void throwRuntimeException(){
        throw new RuntimeException();
    }

    /**
     * 抛出运行时异常
     */
    @RequestMapping("/throwIllegalArgumentException")
    public void throwIllegalArgumentException(){
        throw new IllegalArgumentException();
    }

    /**
     * 抛出自定义异常
     */
    @RequestMapping("/throwMyException")
    public void throwMyException(){
        throw new MyException("我是主动抛出来的");
    }
}