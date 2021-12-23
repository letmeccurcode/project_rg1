import org.junit.Test;

import java.util.UUID;

/**
 * @BelongsProject: project_rg1
 * @Package PACKAGE_NAME
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/13 17:13
 */


public class TestUUID {

    @Test
    public void m1() {
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
        System.out.println(UUID.randomUUID().toString());
    }
}
