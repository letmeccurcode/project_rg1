package com.sgxy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.annotation.WebServlet;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/2 9:15
 */

//该类就是作为一个控制器类来使用的

@Controller
public class ControllerA {

//    发起请求之后 localhost:8080/contextPath/index
//    期望:浏览器响应给我们index.jsp页面

    @RequestMapping(value = "/toIndex")
    public String handle01() {
        System.out.println("handle01方法执行了...");
        return "/WEB-INF/views/index.jsp";
    }
}
