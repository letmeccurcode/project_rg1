package com.sgxy.spring.aop.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.aop.utils
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/25 16:55
 */

public class LogUtils_withoutInter {

    public void logStart(JoinPoint jp) throws IOException {
        System.out.println(jp.getClass());

        Object[] args = jp.getArgs();

        String name = jp.getSignature().getName();

        System.out.println(name + "方法开始..参数是:" + Arrays.toString(args));
    }

    public void logEnd(JoinPoint jp, Object result) {
        Object[] args = jp.getArgs();

        String name = jp.getSignature().getName();
        System.out.println(name + "方法返回..结果是" + result);
    }

    public void logException(JoinPoint jp, Exception e) {
        Object[] args = jp.getArgs();

        String name = jp.getSignature().getName();
        System.out.println(name + "方法异常..异常是" + e);

    }

    public void logFinal(JoinPoint jp) {
        Object[] args = jp.getArgs();

        String name = jp.getSignature().getName();
        System.out.println(name + "方法最终结束..");
    }


    public Object logAround(ProceedingJoinPoint pjp) {
        Object[] args = pjp.getArgs();
        String name = pjp.getSignature().getName();
        Object result = null;
        try {
            System.out.println(name + "开始执行,参数列表是" + Arrays.toString(args));
            result = pjp.proceed(args);
            System.out.println(name + "执行返回,结果是" + result);
        } catch (Throwable throwable) {
            System.out.println(name + "异常是" + throwable);
            throwable.printStackTrace();
        } finally {
            System.out.println(name + "最终结束了");
        }
        return result;
    }
}
