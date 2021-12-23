import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.sgxy.spring.controller.UserController;
import com.sgxy.spring.dao.UserDao;
import com.sgxy.spring.entity.Book;
import com.sgxy.spring.entity.Person;
import com.sgxy.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * @BelongsProject: project_rg1
 * @Package PACKAGE_NAME
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/23 10:28
 */
public class TestSpring1 {

    @Test
    public void test1() {
        //1 创建IOC容器对象
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("springdemo1.xml");
        //2 调用方法获取bean
        Object p1 = cpa.getBean("p1");
        Object p2 = cpa.getBean("p1");
        Person p3 = (Person) cpa.getBean("p1");
        //3 输出打印
        System.out.println(p1 == p2);
        System.out.println(p3);
    }

    @Test
    public void test2() {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("springdemo1.xml");
        Person p1 = cpa.getBean("p2", Person.class);
        System.out.println(p1);
    }

    @Test
    public void test3() {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("springdemo1.xml");
        Person p3 = cpa.getBean("p3", Person.class);
        System.out.println(p3);
    }

    @Test
    public void test4() {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("springdemo1.xml");
        Person p4 = cpa.getBean("p4", Person.class);
        System.out.println(p4);

        System.out.println(p4.getBooks().getClass());

        System.out.println(p4.getMap().getClass());
//        Book book1 = cpa.getBean("book1", Book.class);
//        Book book2 = cpa.getBean("book2", Book.class);
//
//        System.out.println(book1);
//        System.out.println(book2);
    }

    @Test
    public void test5() {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("springdemo1.xml");
        Person p4 = cpa.getBean("p4", Person.class);
        Person p5 = cpa.getBean("p5", Person.class);
        Person p6 = cpa.getBean("p6", Person.class);
//        Person p7 = cpa.getBean("p7", Person.class);
        Person p8 = cpa.getBean("p8", Person.class);
        Person p9 = cpa.getBean("p9", Person.class);

//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
        System.out.println(p8);
        System.out.println(p9);
    }

    @Test
    public void test6() {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("springdemo2.xml");
        Person person1 = cpa.getBean("p9", Person.class);

        cpa.close();
//        Person person2 = cpa.getBean("p9", Person.class);
//        Person person3 = cpa.getBean("p9", Person.class);
//
//        System.out.println(person1 == person2);
//        System.out.println(person3 == person2);

//        导包 mysql-connector-java.jar
//        加载驱动 Class.forName("com.mysql.jdbc.Driver");
//        获取连接 Connection c = DriverManager.getConnection("url","username","password");
//        创建statement statement st = c.createStatement();
//        ResultSet rs = st.executeQuery();

//        db.properties
//        key1=value
//        key2=value
//        key3=value
//        key4=value
//        连接池 c3p0/dbpc/druid
    }

    @Test
    public void test7() throws SQLException {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("springdemo2.xml");

        DruidDataSource ds = cpa.getBean(DruidDataSource.class);

        System.out.println(ds);

        DruidPooledConnection c = ds.getConnection();

        System.out.println(c);
        Statement st = c.createStatement();

//        st.executeQuery("select * from dual;");

//        关闭自动提交
        c.setAutoCommit(false);
        c.rollback();

        c.commit();
    }


    @Test
    public void test8() {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("springdemo3.xml");
        Person p8 = cpa.getBean("p8", Person.class);
        System.out.println(p8);
    }

    @Test
    public void test9() {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("springdemo3.xml");

//        UserController userController = cpa.getBean(UserController.class);
//        UserService userService = cpa.getBean(UserService.class);
//        UserDao userDao = cpa.getBean(UserDao.class);
        Object userController = cpa.getBean("uc");
        Object userController1 = cpa.getBean("uc");
        Object userController2 = cpa.getBean("uc");
//        Object userController = cpa.getBean("userController");
        Object userService = cpa.getBean("userService");
        Object userDao = cpa.getBean("userDao");

        System.out.println(userController);
        System.out.println(userController == userController1);
        System.out.println(userController2 == userController1);
        System.out.println(userService);
        System.out.println(userDao);
    }
    @Test
    public void test10() {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("springdemo3.xml");
        UserController userController = cpa.getBean(UserController.class);
        userController.handleLogin();
    }

}
