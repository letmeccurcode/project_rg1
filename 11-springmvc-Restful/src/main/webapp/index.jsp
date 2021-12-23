<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/9
  Time: 8:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>


<html>
<head>
    <title>Title</title>
    <script src="${ctp}/static/jquery-1.7.2.js"></script>
</head>
<body>


<img src="${ctp}">
<a href="${ctp}/user">get获取所有</a> <br>
<a href="${ctp}/user/18">get根据id获取</a> <br>

<form action="${ctp}/user" method="post">
    姓名:<input type="text" name="username"> <br>
    密码:<input type="text" name="password"> <br>
    <input type="submit" value="post保存">
</form>

<form action="${ctp}/user" method="post">

    姓名:<input type="text" name="username"> <br>
    密码:<input type="text" name="password"> <br>

    <input type="hidden" name="_method" value="put">

    <input type="submit" value="put提交">
</form>

<%--<form action="${ctp}/user" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="delete提交">
</form>--%>

<%--1.需要a标签默认跳转行为失效--%>
<a href="${ctp}/user/19" id="deleteHref">delete删除请求</a>

<form method="post" id="fm">
    <input type="hidden" name="_method" value="delete">
</form>
<%--2.获取a标签的jquery对象--%>

<script>
    <%--3.页面加载完毕之后的函数--%>
    $(function () {
        $("#deleteHref").click(function () {
            alert("别点我" + this.href);
            //将a标签的href属性值设置给form表单的action属性
            $("#fm").attr("action", this.href);
            $("#fm").submit();
            return false;
        })
    });


    $.ajax({
        type: "post",
        url: "",
        data: {"_method":"delete"},
        dataType: "json",
        success: function (data) {

        }
    });
</script>

<%--<a href="${ctp}/user/${o.id}?_method=delete"></a>--%>
<%--<a href="${ctp}/user/${o.id}"></a>--%>
<%--<a href="${ctp}/user/${o.id}"></a>--%>

<%--jquery javascript--%>

</body>
</html>
