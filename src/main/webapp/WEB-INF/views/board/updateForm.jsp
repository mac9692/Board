<%--
  Created by IntelliJ IDEA.
  User: parkjinseong
  Date: 2022/03/16
  Time: 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>글 수정</title>
</head>
<body>
<%
    String id = request.getParameter("id");
%>
<table>
    <form action="/board/update" method="post">
        <tr>
            <td>번호</td>
            <input type="hidden" name="id" value="<%=id%>">
            <td><% out.print(id); %></td>
        </tr>
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
            <td><input type="submit" value="입력"> &nbsp; <a href="/board/list">글목록</a></td>
        </tr>
    </form>
</table>
</body>
</html>
