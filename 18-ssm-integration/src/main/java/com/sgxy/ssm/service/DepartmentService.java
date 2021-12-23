package com.sgxy.ssm.service;

import com.sgxy.ssm.entity.Department;
import com.sgxy.ssm.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.ssm.service
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/20 11:09
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Transactional(readOnly = true)
    public List<Department> selectAllDepts(){
        List<Department> list = departmentMapper.selectAllDepts();

        return list;
    }
}
