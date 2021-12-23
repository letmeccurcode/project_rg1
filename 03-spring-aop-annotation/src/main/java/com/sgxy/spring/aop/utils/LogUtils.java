package com.sgxy.spring.aop.utils;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.aop.utils
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/25 16:55
 */

//@Component
//@Aspect//告诉spring该类是切面类
public class LogUtils {

    /*
        try{
            @Before//前置通知
            method.invoke();
            @AfterReturning//返回通知
        }catch(Exception e){
            @AfterThrowing //异常通知
        }finally{
            @After //后置通知
        }

        @Around
     */


    //@Before -> 定义通知方法什么时候调用
    //execution.. -> 定义通知方法在什么地方被调用
    //execution() 切入点表达式
    @Before("execution(public * com.sgxy.spring.aop.interfaces.impl.MyCalculator.add(Integer,Integer))")
    public void logStart() throws IOException {
        System.out.println("方法开始..");
    }

    @AfterReturning("execution(public * com.sgxy.spring.aop.interfaces.impl.MyCalculator.add(Integer,Integer))")
    public void logEnd() {
        System.out.println("方法返回..");
    }

    @AfterThrowing("execution(public * com.sgxy.spring.aop.interfaces.impl.MyCalculator.add(Integer,Integer))")
    public void logException() {
        System.out.println("方法异常..");

    }

    @After("execution(public * com.sgxy.spring.aop.interfaces.impl.MyCalculator.add(Integer,Integer))")
    public void logFinal() {
        System.out.println("方法最终结束..");
    }
}
