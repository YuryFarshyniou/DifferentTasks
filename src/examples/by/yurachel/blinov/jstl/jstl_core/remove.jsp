<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:set var="user" scope="page">
    "guest" 'client' "admin"
</c:set>
User is set = <c:out value="${user}"/>
<c:remove var="user"/>
<br/>
User after remove = <c:out value="user"/>
</body>
</html>