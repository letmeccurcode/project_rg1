package com.sgxy.spring.controller;

import com.sgxy.spring.dao.UserDao;
import com.sgxy.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/25 8:17
 */
//<bean class="com.sgxy.spring.service.UserService"></bean>
//<bean class="com.sgxy.spring.controller.UserController"></bean>
//@Controller(value = "uc")
//@Controller("uc")
//@Component
//@Scope("singleton")
@Controller
@Scope("prototype")
public class UserController {

    //    UserService userService = new UserService();
//    @Autowired(required = false)
    @Autowired
//    @Qualifier("userService")
    @Qualifier("userServiceExt")
    UserService us;

    /*
        1 Autowired自动装配时 默认的装配规则是根据类型装配 byType
        2 如果同类型的bean有多个 则按照名称进行装配 byName
        3 如果没有同名的bean存在 可以使用@Qualifier("")指明我们需要装配哪个bean
     */

    public void handleLogin() {
        System.out.println("UserController的handleLogin执行...");
//        userService.login();
//        userServiceExt.login();
        us.login();
    }

//    @Autowired
//    public void haha(@Qualifier("userDao") UserDao userDao){
//        userDao.login();
//    }
}
