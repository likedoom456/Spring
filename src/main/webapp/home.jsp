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
</body>
</html>
