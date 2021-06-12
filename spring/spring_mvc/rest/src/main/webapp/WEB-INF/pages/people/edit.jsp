<!DOCTYPE html>
<html xmlns:th="https://thymeleaf.org/">
<head>
    <title>Update person</title>
</head>
<body>
<form th:method="PATCH" th:action="@{/people/{id}(id=${person.id})}" th:object="${person}">
    <label for="name">Enter name: </label>
    <input type="text" th:field="*{name}" id="name"/>
    <br/>
    <input type="submit" value="create.">
</form>
</body>
</html>