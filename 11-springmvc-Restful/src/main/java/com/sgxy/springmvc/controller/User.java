package com.sgxy.springmvc.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/9 8:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;
    private String password;
}
