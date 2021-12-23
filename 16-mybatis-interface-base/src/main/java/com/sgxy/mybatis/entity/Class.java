package com.sgxy.mybatis.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Alias("myclass")
public class Class {

  private Integer cid;
  private String cname;

}
