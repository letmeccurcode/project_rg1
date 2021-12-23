package com.sgxy.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.spring.entity
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/11/23 11:04
 */
@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Book {
    private String book_name;
    private String book_aythor;

//    @Deprecated
    public Book(){
        System.out.println("Book的无参构造执行...");
    }
}
