package com.sgxy.ssm.mapper;

import com.sgxy.ssm.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.ssm.mapper
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/20 11:09
 */

@Repository
public interface DepartmentMapper {

    public List<Department> selectAllDepts();
}
