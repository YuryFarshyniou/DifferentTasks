<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!--Эта страница загружается пользователю в случае возникновения ошибок.
В  эту тсраницу следует добавить возможность перехода на какую либо область приложения.-->
<html>
<head>
    <title>Error page</title>
</head>
<body>
Request from ${pageContext.errorData.requestURi} is failed
<br/>
Servlet name or type: ${pageContext.errorData.servletName}
<br/>
Status code: ${pageContext.errorData.statusCode}
<br/>
Exception: ${pageContext.errorData.throwable}
</body>
</html>