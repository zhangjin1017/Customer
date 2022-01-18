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
    <title>客户列表</title>
</head>
<body style="text-align: center">
<h2>客户列表</h2>
<table border="1" align="center" style="margin-left: 400px">
    <tr>
        <td>姓名</td>
        <td>性别</td>
        <td>生日</td>
        <td>手机号</td>
        <td>邮箱</td>
        <td>描述</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${requestScope.customerList}" var="customer">
        <tr>
            <td>${customer.cname}</td>
            <td>${customer.gender}</td>
            <td>${customer.birthday}</td>
            <td>${customer.cellphone}</td>
            <td>${customer.email}</td>
            <td>${customer.description}</td>
            <td>
                <a href="#">编辑</a>
                <a href="#">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
