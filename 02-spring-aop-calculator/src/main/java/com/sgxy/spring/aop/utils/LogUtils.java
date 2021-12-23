package com.sgxy.spring.aop.utils;

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
public class LogUtils {


    //可变长参数
    public static void logStart(Method method, Object... args) throws IOException {
        System.out.println(method.getName() + "方法开始执行了,参数是" + Arrays.toString(args));

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:/folderA/logs.txt"));
        bw.write("");
    }

    public static void logEnd(Method method, Object result) {
        System.out.println(method.getName() + "方法正常结束了,结果是" + result);
    }

    public static void logException(Method method, Exception e) {
        System.out.println(method.getName() + "方法异常了,异常是" + e);
    }

    public static void logFinal(Method method) {
        System.out.println(method.getName() + "方法最终执行结束了");
    }
}
