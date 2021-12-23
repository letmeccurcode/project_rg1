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

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

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

        //TODO springmvc入门案例
    }

}
