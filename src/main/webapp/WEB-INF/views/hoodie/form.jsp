<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Strona główna</title>
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
<h2 style="text-align: center">Strona główna</h2>
<form:form method="post" modelAttribute="hoodie" action="/hoodie/form">
<div class="card">
    <img src="" style="width:100%">
    <h1>Bluzy damskie</h1>
    <p class="price">Od 150zł</p>
    <p>Wiele rodzajów bluz.Każdy znajdzie coś dla siebie.</p>
     <tr>
         <td>
            <form:select path="colour">
            <form:option value="Czarny"/>
            <form:option value="Biały"/>
            <form:option value="Czerwony"/>
        </form:select>
         </td>
     </tr>
<tr>
    <td>
        <form:select path="size">
            <form:option value="XS"/>
            <form:option value="S"/>
            <form:option value="M"/>
            <form:option value="L"/>
            <form:option value="XL"/>
        </form:select>
    </td>
</tr>
    <tr>
        <td>
            <form:select path="id">
                <form:option value="1"/>
                <form:option value="2"/>
                <form:option value="3"/>
                <form:option value="4"/>
                <form:option value="5"/>
            </form:select>
        </td>
    </tr>
    <input type="submit" value="Wybierz"/>
</div>
<br>
<div class="card">
    <div class="card">
        <img src="" style="width:100%">
        <h1>Bluzy męskie</h1>
        <p class="price">Od 150zł</p>
        <p>Wiele rodzajów bluz.Każdy znajdzie coś dla siebie.</p>

        <tr>
         <td>
             <form:select path="colour">
                 <form:option value="Czarny"/>
                 <form:option value="Biały"/>
                 <form:option value="Czerwony"/>
             </form:select>
         </td>
     </tr>
     <tr>
         <td>
             <form:select path="size">
                 <form:option value="XS"/>
                 <form:option value="S"/>
                 <form:option value="M"/>
                 <form:option value="L"/>
                 <form:option value="XL"/>
             </form:select>
         </td>
     </tr>
        <tr>
            <td>
                <form:select path="id">
                    <form:option value="1"/>
                    <form:option value="2"/>
                    <form:option value="3"/>
                    <form:option value="4"/>
                    <form:option value="5"/>
                </form:select>
            </td>
        </tr>
    <input type="submit" value="Wybierz"/>
</div>
    <br>
<div>
    <div class="card">
        <img src="" style="width:100%">
        <h1>Bluzy dziecięce</h1>
        <p class="price">Od 100zł</p>
        <p>Wiele rodzajów bluz.Każdy znajdzie coś dla siebie.</p>

        <tr>
         <td>
             <form:select path="colour">
                 <form:option value="Czarny"/>
                 <form:option value="Biały"/>
                 <form:option value="Czerwony"/>
             </form:select>
         </td>
     </tr>
     <tr>
         <td>
             <form:select path="size">
                 <form:option value="XS"/>
                 <form:option value="S"/>
                 <form:option value="M"/>
                 <form:option value="L"/>
                 <form:option value="XL"/>
             </form:select>
         </td>
     </tr>
        <tr>
            <td>
                <form:select path="id">
                    <form:option value="1"/>
                    <form:option value="2"/>
                    <form:option value="3"/>
                    <form:option value="4"/>
                    <form:option value="5"/>
                </form:select>
            </td>
        </tr>
    <input type="submit" value="Wybierz"/>
</div>
    </form:form>
</body>
<footer>
    <p>Author: Małgorzata Hardej<br>
        <a href="mailto:mhardej6@wp.pl">mhardej6@wp.pl</a></p>
</footer>
</html>
