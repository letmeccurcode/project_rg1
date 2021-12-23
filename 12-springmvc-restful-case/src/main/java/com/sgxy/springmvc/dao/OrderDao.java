package com.sgxy.springmvc.dao;

import com.sgxy.springmvc.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.dao
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/9 9:01
 */
@Repository
public class OrderDao {//模拟数据库操作
    private static Map<Integer, Order> orders = null;

    {
        //构造代码块
    }

    static {
        //静态代码块
        orders = new HashMap<Integer, Order>();//初始化map
        orders.put(1001, new Order(1001, "家居百货", "2021-11-23 22:48:21", 1000, 1));
        orders.put(1002, new Order(1002, "手机数码", "2021-11-23 22:48:21", 1999, 1));
        orders.put(1003, new Order(1003, "日常出行", "2021-11-23 22:48:21", 2200, 1));
        orders.put(1004, new Order(1004, "酒水食品", "2021-11-23 22:48:21", 1110, 1));
        orders.put(1005, new Order(1005, "厨房用品", "2021-11-23 22:48:21", 2210, 1));
    }

    private static Integer initId = 1006;

    public void save(Order order) {
        if (order.getId() == null) {
            order.setId(initId++);
        }
        orders.put(order.getId(), order);
    }

    public Collection<Order> getAll() {
        return orders.values();
    }

    public Order get(Integer id) {
        return orders.get(id);
    }

    public void delete(Integer id) {
        orders.remove(id);
    }
}

