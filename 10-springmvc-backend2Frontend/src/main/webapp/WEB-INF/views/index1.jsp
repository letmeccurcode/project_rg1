<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/6
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>

<h1>Hello index1!</h1>
<div>
    test1->:${request_msg}
</div>

<div>
    test2->:${requestScope.ModelAndView_msg} <br>
    test2->:${sessionScope.ModelAndView_msg} <br>
    test2->:${sessionScope.session_msg} <br>
    test2->:${applicationScope.ModelAndView_msg} <br>
    <%--    test2->:${ModelAndView_msg} <br>--%>
</div>

<div>
    test3->:${requestScope.Model_msg} <br>
    test3->:${Model_msg} <br>
    test3->:${Model_msg2} <br>
    <%--先去请求域中找名称叫Model_msg的key对应的value
    如果找不到继续到session会话域中找 找不到就继续
    到application应用域中找
    --%>
</div>

<div>
    test4->:${Map_msg} <br>
    test4->:${sessionScope.session_msg} <br>
</div>

<div>
    test5->:${ModelMap_msg}
</div>


<div>
    test6->:${session_msg} <br>
    test6->:${requestScope.session_msg} <br>
    test6->:${sessionScope.session_msg} <br>
</div>

<div>
    test7->:${app_msg} <br>
    test7->:${sessionScope.app_msg} <br>
    test7->:${applicationScope.app_msg} <br>
</div>


<div>
    test8->:${requestScope.hello} <br>
    test8->:${sessionScope.hello} <br>
</div>
</body>
</html>
