package com.sgxy.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

//  myFamilyAddress -> my_family_address
  private Integer sid;
  private String sName;
  private String sgender;
  private Integer age;
  private Integer classid;

  public void study(){}

}
