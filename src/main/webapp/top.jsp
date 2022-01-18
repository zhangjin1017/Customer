<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-01-18
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<%--    <base target="main">--%>
    <title>客户关系管理系统</title>
</head>
<body style="text-align: center">
<h1>客户关系管理系统</h1>
<a target="main" href="${pageContext.request.contextPath}/add.jsp">添加客户</a>
<a target="main" href="${pageContext.request.contextPath}/CustomerServlet?method=findAllCustomers">客户列表</a>
<a target="main" href="${pageContext.request.contextPath}/query.jsp">高级搜索</a>
</body>
</html>
