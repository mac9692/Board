<%--
  Created by IntelliJ IDEA.
  User: parkjinseong
  Date: 2022/03/17
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" charset="UTF-8" content="text/html">
    <title>UserView</title>
</head>
<body>
<table>
    <tr>
        <td>${memberView.id}</td>
        <td>${memberView.password}</td>
        <td>${memberView.email}</td>
        <td>${memberView.name}</td>
        <td>${memberView.authority}</td>
    </tr>
    <tr>
        <td><a href="/member/memberList">회원리스트</a></td>
        <td><a href="">회원정보수정</a></td>
        <td><a href="">회원삭제</a></td>
    </tr>
</table>
</body>
</html>
