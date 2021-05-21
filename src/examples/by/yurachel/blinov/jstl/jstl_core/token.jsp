<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Core: forTokens</title>
</head>
<body>
<c:set var="str" value="45, 76 - 32 : 77 . 91"/>
<c:forTokens var="token" items="${str}" delims=".,-:">
    <c:out value="${token}"/><br/>
</c:forTokens>
</body>
</html>