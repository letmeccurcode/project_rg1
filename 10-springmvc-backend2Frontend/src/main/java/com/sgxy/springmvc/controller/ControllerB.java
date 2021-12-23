package com.sgxy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/8 16:49
 */
@Controller
public class ControllerB {

    @RequestMapping("/m1")
    public String method1() {
//        使用springmvc的方式实现重定向和请求转发
        return "forward:/WEB-INF/views/index4.jsp";
//        return "forward:/index.jsp";
    }

    @RequestMapping("/m2")
    public String method2(Model m) {
//        使用springmvc的方式实现重定向和请求转发
        m.addAttribute("m2_msg", "hello m2_msg");
        return "forward:/m1";
    }

    @RequestMapping("/m3")
    public String method3() {
//        使用springmvc的方式实现重定向和请求转发
        return "redirect:/index5.jsp";
//        return "redirect:/WEB-INF/views/index4.jsp";
    }

    @RequestMapping("/m4")
    public String method4() {
//        使用springmvc的方式实现重定向和请求转发

        return "redirect:/m3";
    }

    @RequestMapping("/m5")
    public String method5() {
//        使用springmvc的方式实现重定向和请求转发

        return "";
    }

//    @RequestMapping("/m6")
//    public String method6() {
//        return "index6";
//    }
}
