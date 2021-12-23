<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/7
  Time: 10:14
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
<a href="${ctp}/handle01">test1->ServletApi设置域数据</a> <br>
<a href="${ctp}/handle02">test2->ModelAndView设置域数据和视图</a> <br>
<a href="${ctp}/handle03">test3->Mode设置域数据</a> <br>
<a href="${ctp}/handle04">test4->Map设置域数据</a> <br>
<a href="${ctp}/handle05">test5->ModelMap设置域数据</a> <br>
<a href="${ctp}/handle06">test6->Session设置域数据</a> <br>
<a href="${ctp}/handle07">test7->application设置域数据</a> <br>
<a href="${ctp}/handle08">test8->@SessionAttributes设置域数据</a> <br>

</body>
</html>
