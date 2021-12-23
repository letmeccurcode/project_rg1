import com.sgxy.spring.aop.interfaces.Calculator;
import com.sgxy.spring.aop.interfaces.impl.MyCalculator;
import com.sgxy.spring.aop.interfaces.impl.MyCalculator_withoutInter;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: project_rg1
 * @Package PACKAGE_NAME
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/26 10:37
 */
public class TestAop {

    //    org.springframework.beans.factory.NoSuchBeanDefinitionException:
//    No qualifying bean of type 'com.sgxy.spring.aop.interfaces.impl.MyCalculator' available
    @Test
    public void test1() {
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext("spring-aop.xml");

//        Calculator calculator = cpa.getBean(Calculator.class);

//        System.out.println(calculator.getClass());

        //class com.sgxy.spring.aop.interfaces.impl.MyCalculator
//        calculator.add(10, 20);

//        class com.sun.proxy.$Proxy19

//        class com.sgxy.spring.aop.interfaces.impl.
//        MyCalculator_withoutInter$$EnhancerBySpringCGLIB$$83ecf30f

        MyCalculator_withoutInter calculator_withoutInter = cpa.getBean(MyCalculator_withoutInter.class);

//        System.out.println(calculator_withoutInter.getClass());
        Integer result = calculator_withoutInter.add(10, 20);

        System.out.println(result);
//        calculator_withoutInter.div(10, 0);
    }
}
