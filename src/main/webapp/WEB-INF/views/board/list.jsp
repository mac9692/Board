<%--
  Created by IntelliJ IDEA.
  User: parkjinseong
  Date: 2022/03/15
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <title>게시판</title>
</head>
<body>
<p><a href="/">Plateer</a> </p>
<table>
    <tr>
        <td>번호</td>
        <td>작성자</td>
        <td>제목</td>
        <td>삭제</td>
    </tr>
    <c:forEach items="${list}" var="dto">
        <tr>
            <td>${dto.id}</td>
            <td>${dto.writer}</td>
            <td><a href="/board/view?id=${dto.id}">${dto.title}</a></td>
            <td><a href="/board/delete?id=${dto.id}">X</a></td>
        </tr>
    </c:forEach>
</table>

<p><a href="/board/writeForm">글 작성</a></p>
</body>
</html>
