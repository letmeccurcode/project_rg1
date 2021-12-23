package com.sgxy.spring.aop.interfaces.proxy;

import com.sgxy.spring.aop.interfaces.Calculator;
import com.sgxy.spring.aop.utils.LogUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.aop.interfaces.proxy
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/25 17:09
 */
public class CalculatorProxy {

    public static Calculator getProxy(final Calculator calculator) {
//        加载类型的classloader
        ClassLoader loader = calculator.getClass().getClassLoader();
//      获取被代理对象实现的所有接口对象
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
//        创建方法执行处理器
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                User user =new User();
//                public void eat(String foodname);
//                user.eat("澳洲龙虾");
//                method -> eat
//                args -> "澳洲龙虾"
//                calculator -> user


                Object result = null;
                try {
                    //方法执行之前
//                    System.out.println("方法开始");
                    LogUtils.logStart(method,args);
                    result = method.invoke(calculator, args);
                    //add.invoke(c,10,20)
//                    System.out.println("方法结束");
                    //方法执行之后
                    LogUtils.logEnd(method,result);
                } catch (Exception e) {//编译时异常 运行时异常 error statckoverflowerror
                    e.printStackTrace();
                    //方法发生异常
//                    System.out.println("方法异常");
                    LogUtils.logException(method,e);
                } finally {
                    //方法最终结束
//                    System.out.println("方法最终结束");
                    LogUtils.logFinal(method);
                }
//                Object result = eat.invoke(user, "澳龙");
                return result;
            }
        };
//        获取到代理对象的实例
        Object proxyInstance = Proxy.newProxyInstance(loader, interfaces, handler);
        return ((Calculator) proxyInstance);
    }
}
