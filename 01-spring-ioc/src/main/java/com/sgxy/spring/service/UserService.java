package com.sgxy.spring.service;

import com.sgxy.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.service
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/25 8:18
 */

@Service
public class UserService {

    //    UserDao userDao = new UserDao();
    @Autowired
    UserDao userDao;

    public void login() {
        System.out.println("UserService的login方法执行...");
        userDao.login();
    }
}
