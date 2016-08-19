<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-08-17
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>edit page</title>
</head>
<body>
<c:if test="${sessionScope.user eq null}">
    <c:redirect url="/index.jsp"/>
</c:if>
<h1>home</h1>
${sessionScope.user.email}
<hr>
<a href="/user/logout">LOG OUT</a>
<hr>
<form action="/book/modify" method="post">
    <input type="hidden" name="id" value="${sessionScope.book.id}">
    <input type="text" name="title" placeholder="TITLE" value="${sessionScope.book.title}"><br>
    <input type="submit" value="SAVE">
</form>
</body>
</html>
