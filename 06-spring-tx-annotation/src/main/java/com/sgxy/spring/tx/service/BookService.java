package com.sgxy.spring.tx.service;

import com.sgxy.spring.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.tx.service
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/1 17:20
 */

//处理业务数据和业务逻辑的javabean
@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    //    execution("* com.sgxy.spring.tx.service.BookService.checkOut()")
    //    execution("* com.sgxy.spring.tx.service.BookService.*()")
//    @Transactional(timeout = 3, readOnly = false, rollbackFor = Throwable.class, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    @Transactional(timeout = 3, readOnly = false)
    public void checkOut() {

        String bookid = "book-005";
        String username = "root";

//        获取图书价格
        Integer price = bookDao.getBookPrice(bookid);

//      1.  更新balance
        bookDao.updateBalance(username, price);

        System.out.println(10 / 0);

//      2.  更新图书库存
        bookDao.updateStock(bookid);
    }

    public void m1() {

    }
}
