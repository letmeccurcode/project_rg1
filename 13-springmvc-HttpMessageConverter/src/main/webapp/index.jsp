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
    <script src="${ctp}/static/jquery-1.7.2.js"></script>
</head>
<body>

<%--
1.表单提交方式post
2.enctype属性值multipart/form-data
3.控制器方法的形参位置需要定义 MultiPartFile upload
4.需要导入commons-fileupload依赖
5.配置resolver CommonsMultipartResolver id=multipartResolver
--%>
<form action="${ctp}/testUpload" method="post" enctype="multipart/form-data">
    姓名:<input type="text" name="username"> <br>

    请选择: <input type="file" name="upload"> <br>
    <input type="submit" value="提交">
</form>


<a href="${ctp}/m1">测试RequestEntity</a>

<form action="${ctp}/m7" method="post">
    username:<input type="text" name="username"> <br>
    password:<input type="text" name="password"> <br>
    <input type="submit" value="提交">
</form>

<form action="${ctp}/m7" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="file">
    <input type="submit" value="上传">
</form>

<a href=""></a>

<button id="sendjson">发送json</button>

<button id="getjson">接收json</button>

<a href="" onclick=""></a>
<script>

    var jsonObj = {"username": "root", "password": "123456"};

    // alert(typeof jsonObj);//object
    //json对象
    //json字符串
    var jsonStr = JSON.stringify(jsonObj);

    // alert(typeof jsonStr);//string
    //JavaScript包含五种类型 string number undefined boolean object
    //java

    $(function () {
        $("#getjson").click(function () {
            $.ajax({
                type: "get",
                url: "${ctp}/m5",
                dataType: "json",
                //响应成功之后控制器会把json数据赋值给data变量
                success: function (data) {
                    var tab = $("<table></table>");
                    // console.log(data);
                    $.each(data, function (i, n) {
                        var tr = $("<tr></tr>");
                        var td = $("<td></td>");
                        // console.log(i + ":" + n);
                        // console.log(n.id + "," + n.name + "," + n.totalprice + "," + n.ordertime + "," + n.status);
                        var str = n.id + "," + n.name + "," + n.totalprice + "," + n.ordertime + "," + n.status;
                        td.text(str);
                        tr.append(td);
                    })
                    tab.append(tr);
                }
            });
        })


        $("#sendjson").click(function () {
            $.ajax({
                type: "post",//请求方式
                url: "${ctp}/m8",//请求地址
                data: jsonStr,//请求数据
                contentType: "application/json",//发送的数据类型
                success: function (data) {//响应成功的回调函数
                    console.log("发送成功")
                }
            });
        })
    })

</script>
</body>
</html>
