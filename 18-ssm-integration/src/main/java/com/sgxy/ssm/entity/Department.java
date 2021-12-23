package com.sgxy.ssm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.ssm.entity
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/20 11:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private long id;
    private String deptId;
    private String deptName;
    private List<Employee> employees;
}
