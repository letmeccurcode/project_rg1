<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/9
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>


<html>
<head>
    <script src="${ctp}/static/jquery-1.7.2.js"></script>
    <script src="${ctp}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <link href="${ctp}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body>

<form class="form-horizontal" action="${ctp}/order" method="post">
    <div class="form-group">
        <label for="input1" class="col-sm-2 control-label">订单名称</label>
        <div class="col-sm-6">
            <input type="text" name="name" class="form-control" id="input1" placeholder="订单名称">
        </div>
    </div>
    <div class="form-group">
        <label for="input2" class="col-sm-2 control-label">下单时间</label>
        <div class="col-sm-6">
            <input type="datetime-local" name="ordertime" class="form-control" id="input2" placeholder="下单时间">
        </div>
    </div>

    <div class="form-group">
        <label for="input3" class="col-sm-2 control-label">订单总额</label>
        <div class="col-sm-6">
            <input type="number" class="form-control" name="totalprice" id="input3" placeholder="订单总额">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">支付状态</label>
        <label class="radio-inline">
            <input type="radio" name="status" id="inlineRadio1" checked="checked" value="1"> 已支付
        </label>
        <label class="radio-inline">
            <input type="radio" name="status" id="inlineRadio2" value="0"> 未支付
        </label>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">保存订单</button>
        </div>
    </div>
</form>


</body>
</html>
