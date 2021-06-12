<!DOCTYPE html>
<html xmlns:th="https://thymeleaf.org/">
<head>
    <title>Show person</title>
</head>
<body>
<p th:text="${person.name}">Value </p>
<p th:text="${person.id}">VALUE</p>

<a th:href="@{/people/{id}/edit(id=${person.id})}">update</a>

<!--Hello jopa -->
</body>
</html>