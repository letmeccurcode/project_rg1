import com.sgxy.spring.tx.dao.BookDao;
import com.sgxy.spring.tx.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @BelongsProject: project_rg1
 * @Package PACKAGE_NAME
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/1 17:12
 */

@ContextConfiguration(locations = {"classpath:spring.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestTX {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private BookService bookService;

    @Test
    public void m1() {

//        System.out.println(bookDao.getBookPrice("book-005"));
//        bookDao.updateBalance("root", 500);

//        bookDao.updateStock("book-005");

        bookService.checkOut();
    }
}
