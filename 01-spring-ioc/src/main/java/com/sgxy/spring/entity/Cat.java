package com.sgxy.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.entity
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/23 11:09
 */
@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Cat {

    private String breed;
    private String name;

    public Cat(){
        System.out.println("Cat的无参构造执行...");
    }
}
