package com.sgxy.springmvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * @BelongsProject: project_rg1
 * @Package com.sgxy.springmvc.entity
 * @Author: 鱼头哥哥
 * @WeChat:15919651285
 * @CreateTime: 2021/12/14 11:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //@NotEmpty 用在集合类上面
    //@NotBlank 用在String上面
    //@NotNull  用在基本类型上
    @NotBlank(message = "用户名不能为空")
    private String username;  //用户名
    @Length(min = 6, max = 18, message = "密码长度必须在6~18位")
    private String password; //用户密码
    @Email(message = "邮箱格式不正确")
//    @Pattern(regexp = "[a-z\\d]+(\\.[a-z\\d]+)*@([\\da-z](-[\\da-z])?)+(\\.{1,2}[a-z]+)+",message = "邮箱格式不正确")
    private String email;    //用户邮箱
    @Pattern(regexp = "[1][3|4|5|7|8][0-9]{9}", message = "手机号码格式不正确")
    private String phone;    //用户电话
    @Past(message = "生日必须是过去的时间")
//    @Future
    private Date birth;
    @Range(min = 0, max = 18, message = "年龄在0-18之间")
    private Integer age;
}
