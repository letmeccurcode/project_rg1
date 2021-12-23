import com.sgxy.ssm.service.DepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @BelongsProject: project_rg1
 * @Package PACKAGE_NAME
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/20 11:16
 */
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSpring {

    @Autowired
    private DepartmentService departmentService;

    @Test
    public void m1() {

        System.out.println(departmentService == null);
        System.out.println(departmentService);
    }
}
