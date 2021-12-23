package com.sgxy.mybatis.mappers;

import com.sgxy.mybatis.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.mybatis.mappers
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/16 8:21
 */
public interface StudentMapper {

//    select * from student where sid = #{sid} => Student

    @Select("select * from student where sid = #{sid}")
    public Student selectStudentById(Integer sid);

//    public List<Student> selectAllStudent();
//    public Integer savaStudent(Student s);
}
