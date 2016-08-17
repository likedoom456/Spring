<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-08-15
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index page</title>
</head>
<body>
<h1>index page</h1>
<form action="/user/login" method="post">
    <input type="text" name="email" placeholder="EMAIL"><br>
    <input type="password" name="password" placeholder="PASSWORD"><br>
    <input type="submit" value="SIGN IN"><br>
</form>
${requestScope.message}
<hr>
<a href="/register.jsp">SIGN UP</a>
</body>
</html>
