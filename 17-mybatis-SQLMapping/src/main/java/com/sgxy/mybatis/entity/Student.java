package com.sgxy.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Alias("mystu2")
public class Student {

//  myFamilyAddress -> my_family_address
  private Integer sid;
  private String sName;
  private String sgender;
  private Integer age;
  private Integer classid;

//  aClass封装该学生所在班级的所有信息
//  private Class aClass;

}
