package com.sgxy.ssm.service;

import com.sgxy.ssm.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.ssm.service
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/20 11:09
 */

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public void sayHello() {
        System.out.println("EmployeeService...sayHello...");

    }
}
