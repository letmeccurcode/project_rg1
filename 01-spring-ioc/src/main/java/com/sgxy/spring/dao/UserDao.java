package com.sgxy.spring.dao;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.dao
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/25 8:18
 */

@Repository
//@Controller
public class UserDao {

    public void login() {
        System.out.println("UserDao的login方法执行...");
    }

    public UserDao() {
        System.out.println("偶来啦...");
    }
}
