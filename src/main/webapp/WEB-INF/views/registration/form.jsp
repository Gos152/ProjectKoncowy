<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Rejestracja</title>
    <style>
        footer{
            text-align:center;
            padding: 3px;
            background-color: grey;
            color:white;
        }
        header{
            text-align: center;
            background-color: grey;
        }
        body{
            text-align: center;
        }
    </style>
</head>
<body>
<header>
    <div>
        <a href="http://localhost:8080/hoodie/form">Strona główna</a>
        <a href="http://localhost:8080/login/form">Logowanie</a>
        <a href="http://localhost:8080/registration/form">Rejestracja</a>
        <a href="http://localhost:8080/contact/form">Kontakt</a>
        <a href="http://localhost:8080/cart/form">Koszyk</a>
    </div>

</header>
<h2 style="text-align: center">Rejestracja</h2>
<form:form method="post" modelAttribute="registration">
    First Name:<form:input path="firstName"/><br>
    Last Name:<form:input path="lastName"/><br>
    Email:<form:input type="email" path="email"/><br>
    Create Password:<form:input type="password" path="createPassword"/><br>
    Repeat Password:<form:input type="password" path="repeatPassword"/><br>

<tr>
    <td>
    <td>Kraj</td>
    <select name="country">
        <option value="-">--Please select</option>
        <option value="PL" selected="selected">Poland</option>
        <option value="UK">United Kingdom</option>
        <option value="AT">Austria</option>
    </select>
    </td>
</tr>
    <input type="submit" value="Wyślij"/>
</form:form>
<footer>
    <p>Author: Małgorzata Hardej<br>
        <a href="mailto:mhardej6@wp.pl">mhardej6@wp.pl</a></p>
</footer>
</body>
</html>