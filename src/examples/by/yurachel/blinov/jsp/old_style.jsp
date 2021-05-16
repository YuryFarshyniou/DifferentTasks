<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title> JSP - page</title>
</head>
<body>
<%! private int count = 0;
    String version = new String("1.2");

    private String getName() {
        return "Old Style";
    } %>
<% System.out.println("Count value: ");%>
<%= count++ %>
<br/>
<% System.out.println("Count value after increment: " + count);%>
<br/>
<% System.out.println("Old version's value: "); %>
<%= version%>
<br/>
<% version = getName();
    System.out.println("New version's value: " + version);%>
</body>
</html>