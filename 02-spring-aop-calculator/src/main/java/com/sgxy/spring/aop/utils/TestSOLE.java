package com.sgxy.spring.aop.utils;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.aop.utils
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/29 17:10
 */
public class TestSOLE {

    int x = 10;

    public static void main(String[] args) {
//        m1();
//        System.out.println(x);

        new TestSOLE().m1();
    }

    public void m1() {
        System.out.println("m1方法被调用...");
        m1();
    }
}
