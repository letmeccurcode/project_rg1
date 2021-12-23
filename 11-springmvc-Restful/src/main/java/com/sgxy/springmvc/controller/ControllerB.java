package com.sgxy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/8 16:49
 */
@Controller
public class ControllerB {

    //    @RequestMapping(value = "",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAllUser() {
        System.out.println("查询到了所有user");
        return "index6";
    }

    @GetMapping("/user/{id}")
    public String getUserByID(@PathVariable("id") Integer id) {
        System.out.println("查询到id为" + id + "的user");
        return "index6";
    }

    @PostMapping("/user")
    public String saveUser(User user) {
        System.out.println("保存user" + user);
        return "index6";
    }

    @DeleteMapping(value = {"/user/{id}", "/user"})
    public String deleteUser(@PathVariable(value = "id", required = false)
                                     Integer id) {
        System.out.println("删除id为" + id + "的用户");
        return "index6";
    }

    @PutMapping("/user")
    public String updateUser(User user) {
        System.out.println("更新user" + user);
        return "index6";
    }
}
