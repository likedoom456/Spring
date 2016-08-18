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
    <title>home page</title>
</head>
<body>
<c:if test="${sessionScope.email eq null}">
    <c:redirect url="/index.jsp"/>
</c:if>
<h1>home</h1>
${sessionScope.email}
<hr>
<a href="/user/logout">LOG OUT</a>
<hr>
<form action="/book/create" method="post">
    <input type="text" name="title" placeholder="TITLE"><br>
    <input type="submit" value="CREATE">
</form>
<hr>
<table border="1" cellspacing="0" style="border-collapse: collapse;">
    <tr>
        <th>ID</th>
        <th>TITLE</th>
        <th colspan="2">OPERATION</th>
    </tr>
    <c:forEach var="book" items="${sessionScope.books}" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${book.title}</td>
            <td><a href="/book/queryById/${book.id}">MODIFY</a></td>
            <td><a href="/book/remove/${book.id}">REMOVE</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
