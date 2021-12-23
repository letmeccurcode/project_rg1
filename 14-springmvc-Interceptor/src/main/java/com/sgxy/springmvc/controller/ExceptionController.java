package com.sgxy.springmvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/14 10:30
 */

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public String handleException(Exception ex, Model m) {

        m.addAttribute("ex", ex);
        return "error";
    }

}
