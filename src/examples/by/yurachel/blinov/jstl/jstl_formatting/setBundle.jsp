<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="en-US" scope="session"/>
<fmt:setBundle basename="resource.pageContent" var="rb"/>
<html>
<head>
    <title><fmt:message key="label.title" bundle="${rb}"/></title>
</head>
<body>
<fmt:message key="label.welcome" bundle="${rb}"/>
<hr/>
<fmt:message key="footer.copyright" bundle="${rb}"/>
</body>
</html>