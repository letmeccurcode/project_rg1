import com.sgxy.spring.aop.interfaces.impl.MyCalculator_withoutInter;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: project_rg1
 * @Package PACKAGE_NAME
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/29 17:45
 */
public class TestAop {

    @Test
    public void m1() {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("spring-aop.xml");

        MyCalculator_withoutInter bean = cpa.getBean(MyCalculator_withoutInter.class);

        Integer add = bean.add(10, 20);
        System.out.println(add);

    }
}
