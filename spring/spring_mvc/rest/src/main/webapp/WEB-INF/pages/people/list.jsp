<!DOCTYPE html>
<html xmlns:th="https://thymeleaf.org/">
<head>
    <title>People</title>
</head>
<body>

<p th:text="${list}"/>
<%--<div th:each="person : ${people}">--%>
<%--    <a th:href="@{people/{id}(id=${person.getId()})}" th:text="${person.getName()}">User </a>--%>
<%--</div>--%>

</body>
</html>