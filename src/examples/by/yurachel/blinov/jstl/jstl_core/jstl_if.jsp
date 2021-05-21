<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Core:if</title>
</head>
<body>
<c:if test="${5<7}" var="firstOperation" scope="page">
    first if: is TRUE
</c:if>
<br/>
<c:out value="First operation variable is : ${ firstOperation} "/>
<br/>
<c:if test="${firstOperation} + some bt" var="secondOperation">
    second if: is TRUE
</c:if>
<br/>
<c:out value="Second operation variable is : ${secondOperation}"/>
</body>
</html>