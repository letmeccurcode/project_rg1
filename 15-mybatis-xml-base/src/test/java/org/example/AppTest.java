package org.example;

import static org.junit.Assert.assertTrue;

import com.sgxy.mybatis.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class AppTest {

    @Test
    public void m1() throws IOException {
//        new classpathxmlapplicationcontext("spring.xml")
//        1 读取文件字节流对象
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//        2 创建sqlsessionfactorybean
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//        3 获取session会话对象
        SqlSession session = factory.openSession();
//        4 调用方法
        Object o =
                session.selectOne("xxx.yyy.zzz.aaa", new ArrayList<>());
//        5 打印
//        o.study();
        ((Student) o).study();
        System.out.println(((Student) o));
//        6 释放资源
        session.close();
    }
}
