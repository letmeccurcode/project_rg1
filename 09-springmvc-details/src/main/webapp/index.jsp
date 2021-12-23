<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/2
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";

    pageContext.setAttribute("contextPath", request.getContextPath());
%>


<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>

<%--
    contextPath/index1
    localhost:8080/mvc/index.jsp

    localhost:8080/mvc/index1
--%>
<a href="${contextPath}/cta/index1">访问handle01方法</a> <br>

<a href="${contextPath}/cta/index2">get请求访问handle02方法</a>

<form action="${contextPath}/cta/index2" method="put">
    <input type="submit" value="post请求访问handle02方法">
</form>

<a href="${contextPath}/cta/index3?username=zhangsan&passw0rd=123&age=20">发起带有参数的请求</a>

<%--<a href="${contextPath}/method2?password=root&username=admin">PathVariable的使用</a>--%>
<a href="${contextPath}/method2/root/administrator">PathVariable的使用</a>


<a href="${contextPath}/method4?username=zhangsan&password=qwer123">get提交参数</a>

<form method="post" action="${contextPath}/method4">

    用户名:<input type="text" name="username"> <br>
    密码:<input type="password" name="password"> <br>

    爱好:
    <input type="checkbox" name="hobby" value="learning"> 学习
    <input type="checkbox" name="hobby" value="coding"> 写代码
    <input type="checkbox" name="hobby" value="selfstudy"> 上自习

    <input type="submit" value="post提交参数">
</form>

<hr>

<form method="post" action="${contextPath}/method10">

    用户名:<input type="text" name="username"> <br>
    密码:<input type="password" name="password"> <br>

    爱好:
    <input type="checkbox" name="hobby" value="learning"> 学习
    <input type="checkbox" name="hobby" value="coding"> 写代码
    <input type="checkbox" name="hobby" value="selfstudy"> 上自习

    邮箱: <input type="email" name="email"> <br>
    性别: <input type="radio" name="gender" value="male"> 男
    <input type="radio" name="gender" value="female">女

    <br>
    <input type="submit" value="使用实体对象封装数据">
</form>
</body>
</html>
