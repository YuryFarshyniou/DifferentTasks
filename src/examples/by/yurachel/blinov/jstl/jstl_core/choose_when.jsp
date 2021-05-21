<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Core: choose</title>
</head>
<body>
<c:set var="number" value="40"/>
<c:choose>
    <c:when test="${ number>10}">
        <c:out value="number ${number} more than 10"/>
    </c:when>
    <c:when test="${ number>40}">
        <c:out value="number ${number} more than 40"/>
    </c:when>
    <c:when test="${ number>60}">
        <c:out value="number ${number} more than 60"/>
    </c:when>
    <c:otherwise>
        <c:out value="number ${number} less than 10"/>
    </c:otherwise>
</c:choose>
</body>
</html>