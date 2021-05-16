<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Timing</title>
</head>
<body>
<h5>Counter</h5>
<!--Action tag useBean используется для создания объекта класса GregorianCalendar. -->
<jsp:useBean id="calendar" class="java.util.GregorianCalendar"/>
<!--Servlet TimeServlet вызвается методом POST.Ему передается с переменной calendar информация о
 времени выполнения страницы.-->
<form name="Simple" action="timeAction" method="POST">
    <input type="hidden" name="time" value="${calendar.timeInMillis}">
    <input type="submit" name="button" value="Count time">
</form>
</body>
</html>