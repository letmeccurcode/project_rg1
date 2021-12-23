package com.sgxy.ssm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.ssm.entity
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/20 11:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private long id;
    private long empId;
    private String empName;
    private String gender;
    private String email;
    private long deptId;
    private Department department;
}


