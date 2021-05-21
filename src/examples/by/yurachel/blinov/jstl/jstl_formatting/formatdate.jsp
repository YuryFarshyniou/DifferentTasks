<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title> Date format</title>
</head>
<body>
<jsp:useBean id="now" class="java.util.Date"/>
<fmt:setLocale value="en-EN"/>
Show date with english format<br/>
Today: <fmt:formatDate value="${now}"/><br/>
<fmt:setLocale value="ru-RU"/>
Show date with Russian format<br/>
Today: <fmt:formatDate value="${now}"/><br/>
Time's style:
(short): <fmt:formatDate value="${now}" type="time" timeStyle="short"/><br/>
(medium): <fmt:formatDate value="${now}" type="time" timeStyle="medium"/><br/>
(long): <fmt:formatDate value="${now}" type="time" timeStyle="long"/><br/>

</body>
</html>
