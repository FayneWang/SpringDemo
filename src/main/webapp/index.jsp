<%--
  Created by IntelliJ IDEA.
  User: wangzz
  Date: 2017/8/21
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://wzz.com" prefix="tagDemo" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <H1><tagDemo:helloWorld/></H1>
    <p/>
    <% String lastName = "1000"; %>
    <tagDemo:widthAttribute firstName="Fayne" lastName="Wang"></tagDemo:widthAttribute>
</body>
</html>
