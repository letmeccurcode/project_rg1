package com.sgxy.ssm.controller;

import com.sgxy.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.ssm.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/20 11:09
 */

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //    localhost:8080/ssm/index
    @RequestMapping("/index")
    public String toIndex() {

        System.out.println("EmployeeController...toIndex...");
        employeeService.sayHello();
        return "index";
    }
}
