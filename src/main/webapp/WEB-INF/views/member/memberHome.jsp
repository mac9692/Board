<%--
  Created by IntelliJ IDEA.
  User: parkjinseong
  Date: 2022/03/16
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <title>MemberHome</title>
</head>
<body>
<h1>
    <a href="/">Plateer</a>
</h1>
Welcome : Member
<sec:authorize access="isAuthenticated()">
    <p>Signin</p>
</sec:authorize>

<sec:authorize access="!isAuthenticated()">
    <p>Signout</p>
</sec:authorize>

User ID : <sec:authentication property="name"/><br/>

<c:url value="/common/signout" var="signoutUrl"/>
<a href="${signoutUrl}">Signout</a><br/>
</body>
</html>
