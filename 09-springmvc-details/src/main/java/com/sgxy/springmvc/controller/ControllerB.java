package com.sgxy.springmvc.controller;

import com.sgxy.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/2 16:43
 */
@Controller
public class ControllerB {

//    public static void main(String[] args) {

//        String num = "10a01";
//
//        int i = Integer.parseInt(num);
//        System.out.println(i);
//    }

    //    @RequestMapping("/method1/aaa")
//    ? 匹配一个任意字符
//    @RequestMapping("/method1/a?a")
//    * 匹配0-n个任意字符
//    @RequestMapping("/method1/a*a")
    @RequestMapping("/**/method1")
    public String m1() {

        return "index1";

    }

    @RequestMapping(value = {"/method2/{pswd}/{admin}", "/method2"})
    public String m2(@PathVariable(value = "pswd", required = false) String password,
                     @PathVariable(value = "admin", required = false) String name) {
        System.out.println("password====>" + password);
        System.out.println("username====>" + name);
        return "index1";
    }


    @RequestMapping(value = {"/method3"})
    public String m3(HttpServletRequest request) {
//        在springmvc框架中 如果需要使用请求对象和响应对象

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username + ":" + password);
        return "index1";
    }

    @RequestMapping(value = {"/method4"})
//    public String m4(String username, String password, String[] hobby) {
    public String m4(@RequestParam(value = "username") String name,
                     @RequestParam("password") String pswd, String hobby) {
        //  请求方法的形式参数的名称 和 请求参数的名称一致
//        System.out.println(username + ":" + password);
        System.out.println(name + ":" + pswd);
        System.out.println(hobby);

//        String[] split = hobby.split(",");

        return "index1";
    }

    @RequestMapping(value = {"/method5"})
    public String m5(@RequestParam(value = "username", required = true, defaultValue = "admin") String name) {
        System.out.println(name);
        return "index1";
    }


    @RequestMapping(value = {"/method6"})
    public String m6(HttpServletResponse response, @RequestParam(value = "pageNum", required = true, defaultValue = "1") String pageNum,
                     @RequestParam(value = "pageSize", required = true, defaultValue = "10") String pageSize) {


        Cookie cookie1 = new Cookie("hello", "helloworld");
        Cookie cookie2 = new Cookie("hello", "helloworld");

        response.addCookie(cookie1);
        response.addCookie(cookie2);
        return "index1";
    }


    @RequestMapping(value = {"/method7/{name1}"})
    public String m7(@PathVariable("name1") String name1, @RequestParam("name2") String username) {
        System.out.println(name1);
        System.out.println(username);
        return "index1";
    }

    @RequestMapping(value = {"/method8"})
    public String m8(@RequestHeader(value = "haha", required = false, defaultValue = "127.0.0.1") String host,
                     @RequestHeader("User-Agent") String userAgent) {
        System.out.println(host);
        System.out.println(userAgent);

//        localhost:8080
//        Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36


//        localhost:8080
//        Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko
        return "index1";
    }

    @RequestMapping(value = {"/method9"})
    public String m9(@CookieValue(value = "JSESSIONID", required = false) String jid, HttpServletRequest request) {

        Cookie[] cookies = request.getCookies();

        for (Cookie c : cookies) {
            String name = c.getName();
            String value = c.getValue();
        }

        System.out.println(jid);
        return "index1";
    }

    @RequestMapping(value = {"/method10"})
    public String m10(User user) {

        //Tomcat8 之前
//            get 修改 server.xml 中的 connector标签的 URIEncoding="UTF-8"属性
//            post request.setCharacterEncoding("UTF-8");
        //Tomcat8 之后
//            get   get请求不会再出现乱码
//            post request.setCharacterEncoding("UTF-8");

//        请求乱码  request.setCharacterEncoding("UTF-8");
//        响应乱码  response.setContentType("text/html;charset=utf-8")
        System.out.println(user);

        return "index1";
    }
}
