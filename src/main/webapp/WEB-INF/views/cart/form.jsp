<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Twój koszyk</title>
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
<h1 style="text-align: center">Twój koszyk</h1>
<p>Dodane produkty do koszyka</p>
<table>
  <tr>
    <th>Rozmiar</th>
    <th>Cena</th>
    <th>Ilość</th>
  </br>
  </tr>

</table>
<button onClick="javascript:location.href='delete?id=${param.id}'">Usuń produkt</button>
<a href="http://localhost:8080/hoodie/form">Powrót do strony głównej</a>

</body>
<footer>
  <p>Author: Małgorzata Hardej<br>
    <a href="mailto:mhardej6@wp.pl">mhardej6@wp.pl</a></p>
</footer>
</html>

