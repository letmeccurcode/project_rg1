package org.example;

import static org.junit.Assert.assertTrue;

import com.sgxy.mybatis.entity.Class;
import com.sgxy.mybatis.entity.Student;
import com.sgxy.mybatis.mapper.ClassMapper;
import com.sgxy.mybatis.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    //    定义成员变量 可以被所有成员方法共享
    SqlSessionFactory sessionFactory = null;

    @Before
    public void createFactory() throws IOException {
        //1 获取sqlsession工厂
        InputStream is = Resources.getResourceAsStream("db/mybatis-config.xml");
        sessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void testSelectOne() throws IOException {
        SqlSession session = sessionFactory.openSession();
        StudentMapper sm = session.getMapper(StudentMapper.class);
        Student student = sm.selectStudentById(1001);
        System.out.println(student);
        session.close();
    }

    @Test
    public void testSelect2Map() throws IOException {
        SqlSession session = sessionFactory.openSession();
        StudentMapper sm = session.getMapper(StudentMapper.class);

        Map<String, Object> map = sm.selectStudent2Map(1001);

        Map<String, Student> mapBykey = sm.selectStudent2MapBykey();

        System.out.println(mapBykey);


        //1 获取所有key的集合
//        Set<String> set = map.keySet();

        //2 遍历key的集合
//        for (String key : set) {
//            Object value = map.get(key);
//
//            System.out.println(key + ":" + value);
//        }


        session.close();
    }

    @Test
    public void testSelectByIds() throws IOException {
        SqlSession session = sessionFactory.openSession();
        StudentMapper sm = session.getMapper(StudentMapper.class);

        List<Integer> list = Arrays.asList(1001, 1002, 1003,1004,1005);
        List<Student> student = sm.selectStudentByIds(list);

        for (Student stu : student) {
            System.out.println(stu);
        }
        session.close();
    }

    @Test
    public void testSelectByCondition() throws IOException {
        SqlSession session = sessionFactory.openSession();
        StudentMapper sm = session.getMapper(StudentMapper.class);

//        mybatis默认会将多个参数放置在一个map集合中
//        arg0:"男"
//        arg1:"33"
//        arg2:...

//        param1:"男"
//        param2:"33"
//        param3:...
//        List<Student> list = sm.selectStudentByCondition("男", "33");

//        HashMap<String, Object> map = new HashMap<>();
//        map.put("gender", "男");
//        map.put("age", "33");


        Student stu = new Student();
        stu.setAge(33);
        stu.setSgender("男");
//        List<Student> list = sm.selectStudentByCondition(map);
        List<Student> list = sm.selectStudentByCondition(stu);

        for (Student s : list) {
            System.out.println(s);
        }

        session.close();
    }

    @Test
    public void testSelectAll() {
        SqlSession session = sessionFactory.openSession();
        StudentMapper sm = session.getMapper(StudentMapper.class);

        List<Student> list = sm.selectAll();

        for (Student s : list) {
            System.out.println(s);
        }

        session.close();

    }


    @Test
    public void testSelectClassByid() {
        SqlSession session = sessionFactory.openSession();
        ClassMapper mapper = session.getMapper(ClassMapper.class);

        Class c = mapper.getClassById(1);

        System.out.println(c);
        session.close();

//        Class(cid=1, cname=软工1班,
//                students=[
//                Student(sid=1009, sName=老李, sgender=男, age=55, classid=1),
//                Student(sid=1010, sName=老赵, sgender=女, age=55, classid=1),
//                Student(sid=1014, sName=老李, sgender=男, age=44, classid=1),
//                Student(sid=1016, sName=秀芹, sgender=女, age=44, classid=1)])

    }

    @Test
    public void testSave() {
        SqlSession session = sessionFactory.openSession();
        StudentMapper sm = session.getMapper(StudentMapper.class);

        Student s = new Student();
        s.setAge(55);
        s.setSgender("男");
        s.setSName("李云龙");
        s.setClassid(1);

        Integer i = sm.saveStudent(s);
        System.out.println(i + "<<<===============");

        System.out.println(s);
//        DML操作需要手动提交
        session.commit();

        session.close();

    }

    @Test
    public void testDelete() {
        SqlSession session = sessionFactory.openSession();
        StudentMapper sm = session.getMapper(StudentMapper.class);

        boolean flag = sm.deleteStudent(1013);
        System.out.println(flag);
        session.commit();
        session.close();
    }

    @Test
    public void testUpdate() {
        SqlSession session = sessionFactory.openSession(true);
        StudentMapper sm = session.getMapper(StudentMapper.class);

        Student s = new Student();

        s.setSid(1015);
        s.setAge(18);

        int i = sm.updateStudent(s);
        System.out.println(i);

        session.close();
    }


}
