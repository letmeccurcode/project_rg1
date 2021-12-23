import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.sgxy.spring.controller.UserController;
import com.sgxy.spring.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * @BelongsProject: project_rg1
 * @Package PACKAGE_NAME
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/23 10:28
 */

//切换到spring的单元测试环境  ioc容器不需要我们自己来创建
//指定配置文件的路径 SpringTest需要根据配置初始化容器
//@ContextConfiguration(locations = {"classpath:springdemo3.xml"})
//使用springtest驱动代替默认的junit单元测试功能
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springdemo3.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSpring2 {

    @Autowired
    UserController userController;

    @Test
    public void test1() {
        userController.handleLogin();
    }
}
