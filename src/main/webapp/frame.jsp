<%--
  Created by IntelliJ IDEA.
  User: 1216916137
  Date: 2022-01-18
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页</title>
</head>
<frameset rows="20%,*">
    <frame src="${pageContext.request.contextPath}/top.jsp" name="top"/>
    <frame src="${pageContext.request.contextPath}/main.jsp" name="main"/>
</frameset>
</html>
