<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form name="LoginForm" method="post" action="../controller">

    <!--Hidden поле указывает на действие,связанное с функционалом этой страницы-->
    <input type="hidden" name="command" value="Login"/>
    Login:<br/>
    <input type="text" name="Login" value=""/>
    <br/>Password:<br/>
    <input type="password" name="password" value=""/>
    <br/>
    ${errorLoginPassMessage} <!--Будет передаваться сообщение после неудачной попытки ввода логина пароля-->
    <br/>
    ${wrongAction} <!--Сообщение о несуществующей комманде.-->
    <br/>
    ${nullPage}
    <br/>
    <input type="submit" value="Log in">
</form>
<hr/>
</body>
</html>