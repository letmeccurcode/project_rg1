<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/9
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>


<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctp}/validUser" method="post">
    姓名:<input type="text" name="username">${errors.username}<br>
    密码:<input type="text" name="password">${errors.password}<br>
    邮箱:<input type="text" name="email">${errors.email}<br>
    手机号:<input type="text" name="phone">${errors.phone}<br>
    生日:<input type="text" name="birth">${errors.birth}<br>
    年龄:<input type="number" name="age">${errors.age}<br>
    <input type="submit" value="提交">
</form>


<form action="${ctp}/convertDate" method="post">

    姓名: <input type="text" name="username"> <br>
    生日:<input type="text" name="birth"> <br>

    <input type="submit" value="提交">
</form>


</body>
</html>
