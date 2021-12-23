package com.sgxy.springmvc.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.entity
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/9 9:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
    private String name;
    private String ordertime;
    private Integer totalprice;
    private Integer status;
    //1 已支付, 0 未支付
}

