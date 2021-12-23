package com.sgxy.spring.tx.entity;

//Model 专门用来封装数据的javabean
public class Book {

  private String bookid;
  private String bookname;
  private long price;


  public String getBookid() {
    return bookid;
  }

  public void setBookid(String bookid) {
    this.bookid = bookid;
  }


  public String getBookname() {
    return bookname;
  }

  public void setBookname(String bookname) {
    this.bookname = bookname;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }

}
