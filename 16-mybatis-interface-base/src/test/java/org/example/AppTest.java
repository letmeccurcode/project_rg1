package org.example;

import static org.junit.Assert.assertTrue;

import com.sgxy.mybatis.entity.Student;
import com.sgxy.mybatis.mappers.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void m1() throws IOException {
        //1 获取sqlsession工厂对象
        InputStream is = Resources.getResourceAsStream("db/mybatis-config.xml");
        //2 根据字节流创建sqlsession工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3 获取与数据库建立的会话对象
        SqlSession session = sessionFactory.openSession();

        //4 获取该接口的代理 实现类对象
        StudentMapper mapper = session.getMapper(StudentMapper.class);

//        class com.sun.proxy.$Proxy7
        System.out.println(mapper.getClass());

        Student student = mapper.selectStudentById(1002);

        System.out.println(student);

        session.close();
    }
}
