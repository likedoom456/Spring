<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-08-17
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sign up page</title>
</head>
<body>
<h1>sign up</h1>
<form action="/user/register" method="post">
    <input type="text" name="email" placeholder="EMAIL"><br>
    <input type="password" name="password" placeholder="PASSWORD"><br>
    <input type="submit" value="SIGN UP"><br>
</form>
${requestScope.message}
</body>
</html>
