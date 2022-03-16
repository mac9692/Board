<%--
  Created by IntelliJ IDEA.
  User: parkjinseong
  Date: 2022/03/15
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>상세보기</title>
</head>
<body>
<table>
    <tr>
        <td>작성자</td>
        <td>${dto.writer}</td>
    </tr>
    <tr>
        <td>제목</td>
        <td>${dto.title}</td>
    </tr>
    <tr>
        <td>글내용</td>
        <td>${dto.content}</td>
    </tr>
    <tr>
        <td><a href="list">글목록</a> &nbsp;&nbsp; <a href="updateForm?id=${dto.id}">글수정</a> &nbsp;&nbsp; <a href="delete?id=${dto.id}">글삭제</a></td>
    </tr>
</table>
</body>
</html>
