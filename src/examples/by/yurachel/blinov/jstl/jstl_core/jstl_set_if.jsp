<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:set var="user" value="guest" scope="page"/>
<c:if test="${not empty user and user eq 'quest'}">
    User is guest
</c:if>
</body>
</html>