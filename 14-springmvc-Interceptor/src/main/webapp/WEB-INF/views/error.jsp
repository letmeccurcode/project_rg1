<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/14
  Time: 10:25
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
<h1>程序出现了异常!!! </h1>

<h2>${ex}</h2>

</body>
</html>
