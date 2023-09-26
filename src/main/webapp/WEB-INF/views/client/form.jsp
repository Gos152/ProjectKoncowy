<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Panel klienta</title>
</head>
<body>
<form:form method="post" modelAttribute="client">
    First Name:<form:input path="firstName"/><br>
    Last Name:<form:input path="lastName"/><br>

</form:form>
</body>
</html>
