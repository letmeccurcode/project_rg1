import com.sgxy.spring.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @BelongsProject: project_rg1
 * @Package PACKAGE_NAME
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/30 10:26
 */

@ContextConfiguration(locations = "classpath:spring.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestJDBCTemplate {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Test
    public void m1() {
        System.out.println(jdbcTemplate);
    }

    @Test
    public void m2() {
//        将eid=5的记录的salary字段更新为1300.00

        String sql = "update employee set salary = ? where emp_id = ?";
        int i = jdbcTemplate.update(sql, 1300.00, 5);

        System.out.println(i > 0 ? "更新成功" : "更新失败");
    }

    @Test
    public void m3() {
//        批量插入多条记录

        String sql = "insert into employee values(?,?,?) ";

        Object[] e1 = {8, "罗翔", 4000};
        Object[] e2 = {9, "张三", 4000};
        Object[] e3 = {10, "刘华强", 4000};
        Object[] e4 = {11, "卖瓜", 4000};

        List<Object[]> list = Arrays.asList(e1, e2, e3, e4);


        int[] ints = jdbcTemplate.batchUpdate(sql, list);

        for (int i : ints) {
            System.out.println(i);
        }
    }


    @Test
    public void m4() {
        String sql = "select * from employee where emp_id = ?";
//        String sql = "select * from employee";
        Employee employee = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Employee>(Employee.class), 5);
        System.out.println(employee);
//        List<Employee> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
//        System.out.println(list);
    }

    @Test
    public void m5() {
        String sql = "select * from employee where salary > ?";

        List<Employee> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class), 4000);

        for (Employee e : list) {

            System.out.println(e);
        }

    }

    @Test
    public void m6() {
//        String sql = "select max(salary) from employee";
        String sql = "select count(*) from employee";

        Integer result = jdbcTemplate.queryForObject(sql, int.class);

        System.out.println(result);
    }

    @Test
    public void m7() {
        String sql = "insert into employee values(:emp_id,:emp_name,:salary)";

        System.out.println(namedParameterJdbcTemplate);

        HashMap<String, Object> map = new HashMap<>();

        map.put("emp_id", 19);
        map.put("emp_name", "1900");
        map.put("salary", 8000);

        int i = namedParameterJdbcTemplate.update(sql, map);

        System.out.println(i);
    }
}
