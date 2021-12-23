package com.sgxy.spring.aop.interfaces.impl;

import com.sgxy.spring.aop.interfaces.Calculator;
import com.sgxy.spring.aop.utils.LogUtils;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.aop.interfaces.impl
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/25 16:50
 */
//@Service
public class MyCalculator implements Calculator {


    @Override
    public Integer add(Integer x, Integer y) {
        return x + y;
    }

    @Override
    public Integer sub(Integer x, Integer y) {
        return x - y;
    }

    @Override
    public Integer mul(Integer x, Integer y) {
        return x * y;
    }

    @Override
    public Integer div(Integer x, Integer y) {
        return x / y;
    }
}
