<!DOCTYPE html>
<html xmlns:th="https://thymeleaf.org/">
<head>
    <title>People</title>
</head>
<body>


<div th:each="person : ${list}">
    <a th:href="@{people/{id}(id=${person.getId()})}" th:text="${person.getName()}">User </a>
</div>
<br/>
<a href="people/new"> new person</a>

</body>
</html>