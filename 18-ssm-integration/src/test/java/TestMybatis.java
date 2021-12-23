import com.sgxy.ssm.entity.Department;
import com.sgxy.ssm.mapper.DepartmentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @BelongsProject: project_rg1
 * @Package PACKAGE_NAME
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/20 15:05
 */
public class TestMybatis {

    @Test
    public void m1() throws IOException {

        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);

        SqlSession session = sessionFactory.openSession();

        DepartmentMapper mapper = session.getMapper(DepartmentMapper.class);

        List<Department> list = mapper.selectAllDepts();

        for (Department d : list) {
            System.out.println(d);
        }

        session.close();

    }

}
