<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>


<html>
<head>
    <title>订单列表展示</title>

    <script src="${ctp}/static/jquery-1.7.2.js"></script>
    <script src="${ctp}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <link href="${ctp}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
          rel="stylesheet">

</head>
<body>

<h1>列表页面</h1>
<button type="button" class="btn btn-primary btn-lg"><a href="${ctp}/toAdd"><font color="white">新增</font></a></button>

<table class="table table-hover table-bordered">

    <tr id="aaa">
        <th>订单编号</th>
        <th>订单名称</th>
        <th>下单时间</th>
        <th>订单总额</th>
        <th>支付状态</th>
        <th>操作订单</th>
    </tr>

    <c:forEach items="${orders}" var="o">
        <tr>
            <td>${o.id}</td>
            <td>${o.name}</td>
            <td>${o.ordertime}</td>
            <td>${o.totalprice}</td>
            <td>${o.status == 1?"已支付":"未支付"}</td>
            <td>
                <button type="button" class="btn btn-warning">
                    <a href="${ctp}/order/${o.id}">修改</a></button>
                <button type="button" class="btn btn-danger">
                        <%--<a href="${ctp}/order/${o.id}" id="deleteHref">删除</a>--%>
                    <a href="${ctp}/order/${o.id}" class="deleteClass">删除</a>
                </button>
            </td>
        </tr>
    </c:forEach>

    <form method="post" id="fm">
        <input type="hidden" name="_method" value="delete">
    </form>

</table>


<!-- Standard button -->
<script>

    $(function () {
        //id具有唯一性
        // $("#deleteHref").click(function () {
        $(".deleteClass").click(function () {
            if (confirm("确认要删除吗?")) {
                $("#fm").attr("action", this.href);
                $("#fm").submit();
            }
            return false;
        })
    })
</script>

</body>
</html>
