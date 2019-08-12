package com.battcn.demo.exception;

import lombok.Data;

/**
 * @auther: chenmingyu
 * @date: 2018/12/6 14:36
 * @description:
 */
@Data
public class MyException extends RuntimeException{

    private Integer code;

    private String msg;

    public MyException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public MyException(String msg) {
        this.code = ResultTypeEnum.SERVICE_ERROR.getCode();
        this.msg = msg;
    }

    public MyException(ResultTypeEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMessage();
    }
}