package com.sgxy.ssm.controller;

import com.sgxy.ssm.entity.Department;
import com.sgxy.ssm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.ssm.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/20 11:08
 */

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Department> selectAllDepts() {
        List<Department> list = departmentService.selectAllDepts();

        return list;
    }
}
