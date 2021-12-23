package com.sgxy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/2 17:29
 */
@Controller
@RequestMapping("/order")
public class OrderController {
//localhost:8080/mvc/order/delete
//localhost:8080/mvc/goods/delete
    @RequestMapping("/setOrder")
    public void setOrder(){

    }
    @RequestMapping("/delete")
    public void deleteOrder(){

    }

    public void checkOutOrder(){

    }
}
