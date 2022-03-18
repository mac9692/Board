<%--
  Created by IntelliJ IDEA.
  User: parkjinseong
  Date: 2022/03/17
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <title>SignUp</title>
</head>
<body>
<h1><a href="/">Plateer</a></h1>
<table>
    <form action="/common/signup" method="post">
        <tr>
            <td>E-Mail</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>PASSWORD</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>NAME</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>AUTHORITY</td>
            <td><input type="text" name="authority"></td>
        </tr>
        <tr>
            <td><input type="submit" value="입력"> </td>
        </tr>
    </form>
</table>
</body>
</html>
