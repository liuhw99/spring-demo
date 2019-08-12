package com.battcn.demo.controller;

import com.battcn.demo.exception.Result;
import com.battcn.demo.exception.ResultTypeEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: chenmingyu
 * @date: 2018/12/6 14:20
 * @description:
 */
@RestController
public class ResultTypeController {

    /**
     * 成功返回值
     */
    @RequestMapping("/querySuccess")
    public Result<String> querySuccess(){
        return Result.success("我是数据");
    }

    /**
     * 错误返回值
     */
    @RequestMapping("/queryError")
    public Result<String> queryError(){
        return Result.error(ResultTypeEnum.SERVICE_ERROR);
    }
}
