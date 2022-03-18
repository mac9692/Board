<%--
  Created by IntelliJ IDEA.
  User: parkjinseong
  Date: 2022/03/17
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>UserList</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>password</td>
        <td>email</td>
        <td>name</td>
        <td>authority</td>
    </tr>
    <c:forEach items="${memberList}" var="dto">
        <tr>
            <td>${dto.id}</td>
            <td>${dto.password}</td>
            <td><a href="/memberView?id=${dto.id}">${dto.email}</a></td>
            <td>${dto.name}</td>
            <td>${dto.authority}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
