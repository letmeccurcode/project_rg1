package com.sgxy.springmvc.controller;

import com.sgxy.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/13 17:28
 */
@Controller
public class ControllerB {

    @RequestMapping("/convertDate")
    public String convertDate(String username, Date birth) {
//    public String convertDate(@valid User user) {

        System.out.println(username);
        System.out.println(birth);

        return "index1";
    }

    @RequestMapping("/validUser")
//    在user对象的属性被绑定完成之后 调用校验规则
    public String validUser(@Valid User user, BindingResult br, Model m) {

        System.out.println("==============>validUser..............");

        HashMap<Object, Object> map = new HashMap<>();
        if (br.hasErrors()) {
            List<FieldError> errorList =
                    br.getFieldErrors();
            for (FieldError error : errorList) {
                String field =
                        error.getField();
                String message = error.getDefaultMessage();
                System.out.println(field + ":" + message);

                map.put(field, message);
            }

            m.addAttribute("errors", map);
            //errors.phone
            //errors.email
            //errors.age
        }

        return "forward:/index.jsp";
    }
}
