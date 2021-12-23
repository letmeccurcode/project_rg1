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

@Component
@Aspect//告诉spring该类是切面类
@Order(2)
public class LogUtils_withoutInter {

    @Pointcut("execution(public * com.sgxy.spring.aop.interfaces.impl.MyCalculator_withoutInter.*(..))")
    public void pointcut_snippet() {
    }

//  前置 -> 后置通知 -> 返回通知
//  前置 -> 后置通知 -> 异常通知


    //@Before -> 定义通知方法什么时候调用
    //execution.. -> 定义通知方法在什么地方被调用
    //execution() 切入点表达式
//    @Before(value = "pointcut_snippet()")
//    @Before("execution(* com.sgxy.spring.aop.interfaces.impl.MyCalculator_withoutInter.add(Integer,Integer))")
//    @Before("execution(* *.*.*.*.*.*.MyCalculator_withoutInter.add(Integer,Integer))")
//    @Before("execution(* *..*.*.*(Integer,Integer))")
//    @Before("execution(* *..*.*.*())")
//    @Before("execution(* *..*.*.*(..))")


    public void logStart(JoinPoint jp) throws IOException {
        System.out.println(jp.getClass());

        Object[] args = jp.getArgs();

        String name = jp.getSignature().getName();

        System.out.println(name + "方法开始..参数是:" + Arrays.toString(args));
    }

//    @AfterReturning(value = "execution(public * com.sgxy.spring.aop.interfaces.impl.MyCalculator_withoutInter.*(Integer,Integer))",
//            returning = "result")

    //    @AfterReturning(value = "pointcut_snippet()", returning = "result")
    public void logEnd(JoinPoint jp, Object result) {
        Object[] args = jp.getArgs();

        String name = jp.getSignature().getName();
        System.out.println(name + "方法返回..结果是" + result);
    }

    //    @AfterThrowing(value = "execution(public * com.sgxy.spring.aop.interfaces.impl.MyCalculator_withoutInter.*(Integer,Integer))",
//            throwing = "e")
//    @AfterThrowing(value = "pointcut_snippet()", throwing = "e")
    public void logException(JoinPoint jp, Exception e) {
        Object[] args = jp.getArgs();

        String name = jp.getSignature().getName();
        System.out.println(name + "方法异常..异常是" + e);

    }

    //    @After("execution(public * com.sgxy.spring.aop.interfaces.impl.MyCalculator_withoutInter.*(Integer,Integer))")
//    @After("pointcut_snippet()")
    public void logFinal(JoinPoint jp) {
        Object[] args = jp.getArgs();

        String name = jp.getSignature().getName();
        System.out.println(name + "方法最终结束..");
    }

    /*
        try{

            user.eat("澳龙");
            eat.invoke(user,"澳龙");

        }catch(){

        }finally{

        }
     */

    //一个注解 起到其他四个注解的作用
    @Around("pointcut_snippet()")
    public Object logAround(ProceedingJoinPoint pjp) {
        //        类与类 extends 继承 不能多继承
        //        类与接口 implements 实现 可以多实现
        //        接口与接口 extends 继承 可以多继承

//        指的是 目标方法运行时需要的实际参数 add(10,20)
        Object[] args = pjp.getArgs();

        String name = pjp.getSignature().getName();

        Object result = null;
        //等同于method.invoke(c,args); 主动推进目标方法执行
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
