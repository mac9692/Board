<%--
  Created by IntelliJ IDEA.
  User: parkjinseong
  Date: 2022/03/17
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <title>Login</title>
</head>
<body>
<h1><a href="/">Plateer</a></h1>

<c:url value="/login" var="loginUrl"/>
<form action="${loginUrl}" method="post">
    <c:if test="${param.error != null}">
        <p>
            Login Error <br>
            ${error_message}
        </p>
    </c:if>
    ID : <input type="text" name="username"> <br/>
    PASSWORD : <input type="text" name="password"> <br/>
    <input type="submit" value="login"> <br/>
</form>
</body>
</html>
