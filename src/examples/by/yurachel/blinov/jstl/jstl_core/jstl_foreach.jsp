<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Core: forEach</title>
</head>
<body>
<table>
    <c:forEach var="elem" items="${list}" varStatus="status">
        <tr>
            <td><c:out value="${elem}"/></td>
            <td><c:out value="${elem.id}"/></td>
            <td><c:out value="${elem.text}"/></td>
            <td><c:out value="${elem.count}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>