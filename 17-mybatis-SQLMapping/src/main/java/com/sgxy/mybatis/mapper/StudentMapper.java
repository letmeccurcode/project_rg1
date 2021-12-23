package com.sgxy.mybatis.mapper;

import com.sgxy.mybatis.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.mybatis.mappers
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/16 8:21
 */
public interface StudentMapper {

    /**
     * 1 根据id查询学生信息
     *
     * @param sid
     * @return
     */
//    @Select("select * from student where sid = #{sid}")
//    @ResultType(Student.class)
    public Student selectStudentById(Integer sid);

    public Map<String, Object> selectStudent2Map(Integer sid);

//    查询学生信息 把学生sid作为map的key 把整体记录封装的pojo对象作为value
//    @MapKey("sid")
    @MapKey("sName")
    public Map<String ,Student> selectStudent2MapBykey();

    //1 key -> param1....paramn
//    public List<Student> selectStudentByCondition(String sgender, String age);
    //2 自定义key的名称
//    gender:"男"
//    myage:"33"
    /*public List<Student> selectStudentByCondition(
            @Param("gender") String sgender,
            @Param("myage") String age);
*/
    //如果参数特别多 可以将接口方法的形参定义为map集合
//    public List<Student> selectStudentByCondition(Map<String, Object> map);
//    如果参数都是某个pojo的属性 可以将属性设置在对象上 对象传递给sql映射文件
    public List<Student> selectStudentByCondition(Student s);

    /*select * from tab where sid in (1,2,3)*/
    public List<Student> selectStudentByIds(List<Integer> list);

    /**
     * 2 查询所有学生
     *
     * @return
     */
//    @Select("select * from student")
//    @ResultType(Student.class)
    public List<Student> selectAll();

    /**
     * 3 保存学生信息
     *
     * @param s
     */
    public Integer saveStudent(Student s);

    /**
     * 4 根据id删除学生
     *
     * @param sid
     * @return
     */
//    @Delete("delete from student where sid = #{sid} ")
    public boolean deleteStudent(Integer sid);

    /**
     * 5 更新学生信息
     *
     * @param s
     * @return
     */
    public int updateStudent(Student s);


}
