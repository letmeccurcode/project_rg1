<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/2
  Time: 9:24
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

<%--localhost:8080/mvc/
                    welcome.jsp
                    toIndex
                --%>
<a href="${contextPath}/toIndex">点我去到首页</a>
</body>
</html>
