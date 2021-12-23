package com.sgxy.mybatis.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Alias("myclass2")
public class Class {

  private Integer cid;
  private String cname;

  private List<Student> students;
}
