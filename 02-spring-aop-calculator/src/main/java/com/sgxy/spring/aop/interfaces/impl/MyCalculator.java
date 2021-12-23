package com.sgxy.spring.aop.interfaces.impl;

import com.sgxy.spring.aop.interfaces.Calculator;
import com.sgxy.spring.aop.utils.LogUtils;

import java.io.FileOutputStream;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.aop.interfaces.impl
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/25 16:50
 */
public class MyCalculator implements Calculator {
    @Override
    public Integer add(Integer x, Integer y) {
//        System.out.println("add方法执行了,参数是" + x + "," + y);
//        LogUtils.logStart(x, y);
        return x + y;
    }

    @Override
    public Integer sub(Integer x, Integer y) {
//        System.out.println("sub方法执行了,参数是" + x + "," + y);
//        LogUtils.logStart(x, y);
        return x - y;
    }

    @Override
    public Integer mul(Integer x, Integer y) {
//        System.out.println("mul方法执行了,参数是" + x + "," + y);
//        LogUtils.logStart(x, y);
        return x * y;
    }

    @Override
    public Integer div(Integer x, Integer y) {
//        System.out.println("div方法执行了,参数是" + x + "," + y);
//        LogUtils.logStart(x, y);
        return x / y;
    }
}
