package com.sgxy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/2 16:43
 */
@Controller
@RequestMapping("/cta")
public class ControllerA {

    //    @RequestMapping("index1")
    @RequestMapping(value = "/index1")
//    @RequestMapping(value = {"/index", "/jsp1", "/hello1"})
    public String handle01() {

        System.out.println("handle01方法执行...");
//        return "/WEB-INF/views/index1.jsp";
        return "index1";
    }

    @RequestMapping(value = "/index2", method = {RequestMethod.GET, RequestMethod.POST})
//    @RequestMapping(value = "/index2", method = RequestMethod.PUT)


//      RestFUL 提供了前置条件 Restful风格的url地址
//    localhost:8080/mvc/index?username=root
//    localhost:8080/mvc/index/root

//    @PostMapping("/index") post
//    @GetMapping("/") get
//    @PutMapping("/") put
//    @DeleteMapping("/") delete
    public String handle02() {

        System.out.println("handle02方法执行...");
        return "index2";
    }


    //    @RequestMapping(value = "/index3", params = {"username", "!password", "age=18"})
    @RequestMapping(value = "/index3", headers = {"User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36"})
    public String handle03() {

        System.out.println("handle03方法执行...");
        return "index3";
    }
}
