
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Koszyk zakupowy</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
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
    .card{
      box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
      max-width: 300px;
      margin:auto;
      text-align:center;
      font-family: arial;
    }
    .price{
      color:grey;
      font-size: 22px;
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
<h2 style="text-align: center">Formularz kontaktowy</h2>

<form:form method="post" modelAttribute="contact">
  First name: <form:input path="firstName" /><form:errors path="firstName" element="div" cssClass="error" /><br />
  Last name: <form:input path="lastName" /><form:errors path="lastName" element="div" cssClass="error" /><br />
  Email : <form:input path="email"/><br />
  <form:errors path="email" element="div" cssClass="error" />
  Opis: <form:textarea path="description"/><form:errors path="description" element="div" cssClass="errorDiv" /><br>
  <input type="submit" value="Wyślij"></input>
</form:form>

</body>
<footer>
  <p>Author: Małgorzata Hardej<br>
    <a href="mailto:mhardej6@wp.pl">mhardej6@wp.pl</a></p>
</footer>
</html>