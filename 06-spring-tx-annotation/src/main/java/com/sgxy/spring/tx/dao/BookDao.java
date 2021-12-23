package com.sgxy.spring.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.tx.dao
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/1 17:07
 */
@Repository
public class BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    1 根据图书id获取图书价格

    public Integer getBookPrice(String bookid) {
        String sql = "select price from book where bookid = ?";
        Integer price = jdbcTemplate.queryForObject(sql, Integer.class, bookid);
        return price;
    }

//    2 根据图书价格和用户name修改用户balance

    public void updateBalance(String username, Integer price) {

   /*     try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        String sql = "update account set balance = balance - ? where username = ?";
        jdbcTemplate.update(sql, price, username);
    }

    //    3 根据图书id修改图书库存
    public void updateStock(String bookid) {
        String sql = "update bookstock set stock = stock - ? where bookid = ?";
        jdbcTemplate.update(sql, 1, bookid);
    }
}
