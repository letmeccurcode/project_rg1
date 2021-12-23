import com.sgxy.spring.aop.interfaces.Calculator;
import com.sgxy.spring.aop.interfaces.impl.MyCalculator;
import com.sgxy.spring.aop.interfaces.proxy.CalculatorProxy;
import org.junit.Test;

import java.util.Arrays;

/**
 * @BelongsProject: project_rg1
 * @Package PACKAGE_NAME
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/25 16:51
 */
public class TestAop1 {

    @Test
    public void test1() {
        MyCalculator mc = new MyCalculator();

//        Integer result = mc.add(20, 10);
//        System.out.println(result);

        Calculator proxy = CalculatorProxy.getProxy(mc);

//        Integer result = proxy.add(10, 20);
        Integer result = proxy.div(10, 0);

        //add.invoke(proxy,10,20);
        System.out.println(result);

        System.out.println(Arrays.toString(mc.getClass().getInterfaces()));
        System.out.println(Arrays.toString(proxy.getClass().getInterfaces()));
    }
}
