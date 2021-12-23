package com.sgxy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
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
//@SessionAttributes(value = {"hello"})
@SessionAttributes(types = {String.class})
//如果请求域中有一个名为hello的键值对,那么就把该键值对也向session域中设置一份
public class ControllerA {

    @RequestMapping("/handle01")
    public String handle01(HttpServletRequest request) {
        request.setAttribute("request_msg", "hello request!");
        return "index1";
    }

    @RequestMapping("/handle02")
    public ModelAndView handle02() {
//        1 创建ModelAndView对象
        ModelAndView mv = new ModelAndView("index1");
//        ModelAndView modelAndView = mv.addObject("ModelAndView", "Hello ModelAndView");
//        存放的数据默认是放在请求域中的
        mv.addObject("ModelAndView_msg", "Hello ModelAndView");
        return mv;
    }

    @RequestMapping("/handle03")
    public String handle03(Model m) {
        m.addAttribute("Model_msg", "Hello Model");
        System.out.println("======>" + m.getClass().getName());
//        Model 存放域数据
//        ======>org.springframework.validation.support.BindingAwareModelMap
        return "index1";
    }

    @RequestMapping("/handle04")
    public String handle04(Map<String, Object> map) {
        map.put("Map_msg", "Hello Map_msg");
        System.out.println("======>" + map.getClass().getName());
//        Map 存放域数据
//        ======>org.springframework.validation.support.BindingAwareModelMap
        return "index1";
    }

    @RequestMapping("/handle05")
    public String handle05(ModelMap mm) {
        mm.addAttribute("ModelMap_msg", "Hello ModelMap_msg");
//        ModelMap 存放域数据
        System.out.println("======>" + mm.getClass().getName());
//        ======>org.springframework.validation.support.BindingAwareModelMap
        return "index1";
    }

    @RequestMapping("/handle06")
    public String handle06(HttpSession session) {
        session.setAttribute("session_msg", "Hello session");
        return "index1";
    }


    @RequestMapping("/handle07")
    public String handle07(HttpServletRequest request, HttpSession session) {

        ServletContext sc1 = request.getServletContext();
        ServletContext sc2 = session.getServletContext();
        System.out.println(sc1 == sc2);

        sc1.setAttribute("app_msg", "hello app_msg");

        return "index1";
    }

    @RequestMapping("/handle08")
    public String handle08(Model m) {
        m.addAttribute("hello", "hello springmvc!");
        return "index1";
    }

    @RequestMapping("/handle09")
    public void handle09(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/WEB-INF/views/index2.jsp").forward(request, response);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    //    请求转发 可以访问安全目录下的资源 访问路径需要携带项目名
    //    重定向 不可以访问安全目录下的资源 访问路径不用携带项目名
    @RequestMapping("/handle10")
    public void handle10(HttpServletResponse response, HttpServletRequest request) throws IOException {
//        response.sendRedirect("mvc/index2.jsp");
//        response.sendRedirect(request.getContextPath() + "/index2.jsp");
        response.sendRedirect(request.getContextPath() + "/handle11");

    }

    @RequestMapping("/handle12")
    public void handle12(HttpServletResponse response) throws IOException {
        response.getWriter().write("<h1>Hello respong!</h1>");
    }

    @RequestMapping("/handle11")
    public String handle11() {

        return "index2";
    }

}
