<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:set var="number" value="7.1" scope="session"/>
<c:if test="${number<9.0}">
    <c:out value="Number ${number}"/> is smaller than (9.0)
</c:if>
</body>
</html>