package com.sgxy.springmvc.controller;

import com.sgxy.springmvc.controller.entity.Order;
import com.sgxy.springmvc.controller.entity.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/9 17:28
 */
//@Controller
@RestController
public class ControllerA {

    @RequestMapping("/m1")
    public String method1(RequestEntity<String> re) {
        System.out.println(re.getMethod());
        System.out.println(re.getUrl());
        System.out.println(re.getBody());
        System.out.println(re.getHeaders());
        return "index1";
//        GET
//        http://localhost:8080/mvc/m1
//        null
//        [host:"localhost:8080", connection:"keep-alive",
//        sec-ch-ua:"" Not A;Brand";v="99",
//        "Chromium";v="96",
//        "Google Chrome";v="96"", sec-ch-ua-mobile:"?0",
//        sec-ch-ua-platform:""Windows"",
//        upgrade-insecure-requests:"1",
//        user-agent:"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko)
//        Chrome/96.0.4664.93 Safari/537.36",
//        accept:"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9", sec-fetch-site:"same-origin", sec-fetch-mode:"navigate", sec-fetch-user:"?1", sec-fetch-dest:"document", referer:"http://localhost:8080/mvc/", accept-encoding:"gzip, deflate, br", accept-language:"zh-CN,zh;q=0.9", cookie:"JSESSIONID=49AF44B960F534C91699DD2870C926EE"]
    }


    @RequestMapping("/m2")
    public ResponseEntity<String> method2() {
        String body = "<h1>Hello RequestEntity!</h1>";
        HttpHeaders h = new HttpHeaders();
        h.set("Hello", "Hello entity");
        ResponseEntity<String> responseEntity = new ResponseEntity<>(body, h, HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping("/m3")
//    @ResponseBody
    public String method3() {
        return "index1";
    }

    @RequestMapping("/m4")
//    @ResponseBody
    public Order method4() {
        Order order = new Order(1007, "家居百货", "2021-12-9 17:52:30", 4000, 1);
        return order;
    }


    @RequestMapping("/m5")
//    @ResponseBody
    public List<Order> method5() {
        Order order1 = new Order(1007, "家居百货", "2021-12-9 17:52:30", 4000, 1);
        Order order2 = new Order(1007, "家居百货", "2021-12-9 17:52:30", 4000, 1);
        Order order3 = new Order(1007, "家居百货", "2021-12-9 17:52:30", 4000, 1);
        Order order4 = new Order(1007, "家居百货", "2021-12-9 17:52:30", 4000, 1);
        Order order5 = new Order(1007, "家居百货", "2021-12-9 17:52:30", 4000, 1);

        List<Order> list = Arrays.asList(order1, order2, order3, order4, order5);
        return list;
    }


    @RequestMapping("/m6")
    @ResponseBody
    public Map<String, Object> method6() {
        Order order1 = new Order(1001, "家居百货", "2021-12-9 17:52:30", 4000, 1);
        Order order2 = new Order(1002, "家居百货", "2021-12-9 17:52:30", 4000, 1);
        Order order3 = new Order(1003, "家居百货", "2021-12-9 17:52:30", 4000, 1);
        Order order4 = new Order(1004, "家居百货", "2021-12-9 17:52:30", 4000, 1);
        Order order5 = new Order(1005, "家居百货", "2021-12-9 17:52:30", 4000, 1);

        HashMap<String, Object> map = new HashMap<>();

        map.put("1001", order1);
        map.put("1002", order2);
        map.put("1003", order3);
        map.put("1004", order4);
        map.put("1005", order5);
        return map;
    }


    @RequestMapping("/m7")
    public String method7(@RequestBody String body) {

        System.out.println(body);
        return "index1";
    }

    @RequestMapping("/m8")
//    public String method8(@RequestBody String body) {
    public String method8(@RequestBody User user) {
        System.out.println(user);
        return "index1";
    }
}
