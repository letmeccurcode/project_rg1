package com.sgxy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/6 17:58
 */
@Controller
@RequestMapping("/sss")
public class ControllerA {

//    @RequestMapping(value = "/putAction", method = RequestMethod.PUT)
    @PutMapping("/putAction")
    public String putAction() {
        System.out.println("putAction方法执行了...");
        return "index2";
    }

//    @RequestMapping(value = "/deleteAction", method = RequestMethod.DELETE)
    @DeleteMapping("/deleteAction")
    public String deleteAction() {
        System.out.println("deleteAction方法执行了...");
        return "index2";
    }
}
