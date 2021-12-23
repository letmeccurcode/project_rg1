package com.sgxy.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.entity
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/23 10:20
 */
@Data
//@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private int age;
    private String gender;

    private Cat c;

    private Book book;

    private List<Book> books;

    private Map<String, Object> map;

    private Properties pp;

    public Person(Book book){
        this.book = book;;
        System.out.println("带有book的构造方法执行...");
    }

    public Person() {
        System.out.println("Person的无参构造执行...");
    }


    public void start() {
        System.out.println("Person的初始化方法执行..");
    }

    public void end() {
        System.out.println("Person的销毁方法执行..");
    }
}
