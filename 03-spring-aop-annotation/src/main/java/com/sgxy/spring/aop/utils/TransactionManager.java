package com.sgxy.spring.aop.utils;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.aop.utils
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/29 17:25
 */

@Component
@Aspect
@Order(1)
public class TransactionManager {

    @Before("com.sgxy.spring.aop.utils.LogUtils_withoutInter.pointcut_snippet()")
    public void setAutoCommit() {
        System.out.println("事务...开启事务");
    }

    @AfterReturning("com.sgxy.spring.aop.utils.LogUtils_withoutInter.pointcut_snippet()")
    public void commit() {
        System.out.println("事务...提交事务");
    }

    @AfterThrowing("com.sgxy.spring.aop.utils.LogUtils_withoutInter.pointcut_snippet()")
    public void rollback() {
        System.out.println("事务...回滚事务");
    }

    @After("com.sgxy.spring.aop.utils.LogUtils_withoutInter.pointcut_snippet()")
    public void release() {
        System.out.println("事务...释放资源");
    }
}
