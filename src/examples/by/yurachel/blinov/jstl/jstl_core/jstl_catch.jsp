<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Core: catch</title>
</head>
<body>
<c:set var="number" value="7.1" scope="session"/>
<c:catch var="formatException">
    <c:if test="${number<9}">
        <c:out value="Number ${number}"/> is smaller than (9.0)
    </c:if>
</c:catch>
<br/>
<c:if test="${not empty formatException}">
    Wrong format number: <c:out value="${number}"/> isn't long
    <br/>
    <hr/>
    Generated exception
    <hr/>
    ${formatException}
</c:if>
</body>
</html>