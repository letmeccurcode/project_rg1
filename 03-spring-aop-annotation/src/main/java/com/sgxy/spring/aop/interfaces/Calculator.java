package com.sgxy.spring.aop.interfaces;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.aop.interfaces
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/25 16:49
 */

/**
 * 计算器接口 声明加减乘除四个抽象方法
 */
public interface Calculator {

    Integer add(Integer x, Integer y);

    Integer sub(Integer x, Integer y);

    Integer mul(Integer x, Integer y);

    Integer div(Integer x, Integer y);
}

