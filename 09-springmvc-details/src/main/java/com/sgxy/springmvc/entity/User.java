package com.sgxy.springmvc.entity;

import java.util.Arrays;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.entity
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/6 17:04
 */

public class User {

    private String username;
    private String password;
    private String[] hobby;

    private String email;
    private String gender;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    //浏览器传输的请求参数的参数名和
    //实体类中的属性名一致 -> setXxx 方法 去掉set前缀 -> 首字母小写
    public void setPswd(String password) {
        this.password = password;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User() {
    }

    public User(String username, String password, String[] hobby, String email, String gender) {
        this.username = username;
        this.password = password;
        this.hobby = hobby;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
