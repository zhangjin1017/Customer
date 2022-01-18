<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-01-18
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加客户</title>
</head>
<body style="text-align: center">
<h2 align="center">添加客户</h2>
<form action="${pageContext.request.contextPath}/CustomerServlet" method="post">
            <input type="hidden" name="method" value="add">
    <table border="0" align="center" width="40%" style="margin-left: 500px">
        <tr>
            <td>客户名称</td>
            <td><input type="text" name="cname"/></td>
        </tr>
        <tr>
            <td>客户性别</td>
            <td><input type="text" name="gender"/></td>
        </tr>
        <tr>
            <td>客户生日</td>
            <td><input type="date" name="birthday"/></td>
        </tr>
        <tr>
            <td>客户电话</td>
            <td><input type="text" name="cellphone"/></td>
        </tr>
        <tr>
            <td>客户邮箱</td>
            <td><input type="text" name="email"/></td>
        </tr>
        <tr>
            <td>客户描述</td>
            <td><input type="text" name="description"/></td>
        </tr>
    </table>
    <button type="submit">提交</button>
</form>
</body>
</html>
