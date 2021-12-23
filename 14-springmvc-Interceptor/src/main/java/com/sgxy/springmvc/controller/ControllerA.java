package com.sgxy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/13 17:28
 */
@Controller
public class ControllerA {

    @RequestMapping("/to_index1")
    public String method1() {

        System.out.println(10 / 0);

        return "index1";
    }

    @RequestMapping("/to_index2")
    public String method2() {

        return "index2";
    }

    @RequestMapping("/to_index3")
    public String method3() {
        int[] arr = {};
        System.out.println(arr[10]);
        return "index3";
    }

    //    x/y/z/to_index4
//    aaa/to_index4
//    /to_index4
    @RequestMapping("/**/to_index4")
    public String method4() {

        return "index4";
    }
}
