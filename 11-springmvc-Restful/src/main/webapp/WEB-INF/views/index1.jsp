<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/6
  Time: 17:59
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
<%--地址栏 get--%>
<a href=""></a>

<form action="" method="get"></form>

<form action="" method="post"></form>

<form action="${ctp}/putAction" method="post">

    <input type="hidden" name="_method" value="put">

    <input type="submit" value="put提交">
</form>

<form action="${ctp}/deleteAction" method="post">

    <input type="hidden" name="_method" value="delete">

    <input type="submit" value="delete提交">
</form>

</body>
</html>
