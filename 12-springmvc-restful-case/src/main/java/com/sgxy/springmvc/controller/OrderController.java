package com.sgxy.springmvc.controller;

import com.sgxy.springmvc.dao.OrderDao;
import com.sgxy.springmvc.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.controller
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/9 9:11
 */
@Controller
public class OrderController {

    @Autowired
    OrderDao orderDao;

    //    @RequestMapping(value = "/order",method = RequestMethod.GET)
    @GetMapping(value = "/order")
    public String getAllOrder(Model m) {
        //查询所有订单
        Collection<Order> orders = orderDao.getAll();
        m.addAttribute("orders", orders);
        return "order_list";
    }

    @GetMapping(value = "/order/{id}")
    public String getOrderByID(@PathVariable("id") Integer id, Model m) {
        Order order = orderDao.get(id);
        m.addAttribute("order", order);
        return "order_echo";
    }


    @PostMapping(value = "/order")
    public String saveOrder(Order order) {
        orderDao.save(order);
        return "redirect:/order";
    }

    @DeleteMapping(value = "/order/{id}")
    public String deleteOrder(@PathVariable("id") Integer id) {
        orderDao.delete(id);
        return "redirect:/order";
    }

    @PutMapping(value = "/order")
    public String updateOrder(Order order) {
        orderDao.save(order);
        return "redirect:/order";
    }
}
