<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Number format</title>
</head>

<body>
<c:set var="currentNumber" value="118000"/>
<c:out value="Output number's format: ${currentNumber}"/><br/>
Format (default) : <fmt:formatNumber value="${currentNumber}"/><br/>
Percent format : <fmt:formatNumber value="${currentNumber}" type="percent"/><br/>
<fmt:setLocale value="be-BY"/>
Belarus rubel : <fmt:formatNumber value="${currentNumber}" type="currency"/><br/>
<fmt:setLocale value="pl-PL"/>
Polish currency : <fmt:formatNumber value="${currentNumber}" type="currency"/>
French currency : <fmt:setLocale value="fr-FR"/>
<fmt:formatNumber value="${currentNumber}" type="currency"/>
</body>
</html>
