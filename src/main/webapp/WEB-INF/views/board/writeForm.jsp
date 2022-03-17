<%--
  Created by IntelliJ IDEA.
  User: parkjinseong
  Date: 2022/03/15
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>글 작성</title>
</head>
<body>
<table>
    <form action="/board/write" method="post">
        <tr>
            <td>작성자</td>
            <td><input type="text" name="writer"></td>
        </tr>
        <tr>
            <td>제목</td>
            <td><input type="text" name="title"></td>
        </tr>
        <tr>
            <td>글내용</td>
            <td><input type="text" name="content"></td>
        </tr>
        <tr>
            <td><input type="submit" value="입력"> &nbsp;&nbsp; <a href="/board/list">글목록</a></td>
        </tr>
    </form>
</table>
</body>
</html>
