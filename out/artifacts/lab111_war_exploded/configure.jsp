<%--
  Created by IntelliJ IDEA.
  User: Magda
  Date: 25.05.2017
  Time: 01:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="/META-INF/tlds/tags.tld" %>
<%@ taglib prefix="moje" uri="/META-INF/tlds/maleLitery.tld" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="index.jsp"><moje:maleLiteryTag
                    key="maleNazwa">YourBMI</moje:maleLiteryTag></a>
        </div>
        <ul class="nav navbar-nav">

            <li class="active"><a href="index.jsp"><moje:maleLiteryTag
                    key="maleNaglowki">Strona główna </moje:maleLiteryTag></a></li>


            <li><a href="editLabels.jsp"> <moje:maleLiteryTag key="maleNaglowki">Edycja etykiet</moje:maleLiteryTag></a>
            </li>


            <li><a href="configure.jsp"> <moje:maleLiteryTag key="maleNaglowki">Konfiguracja</moje:maleLiteryTag></a>
            </li>


            <li><a href="history.jsp"> <moje:maleLiteryTag key="maleNaglowki">Historia Operacji</moje:maleLiteryTag></a>
            </li>


            <li><a href="bmi.jsp"> <moje:maleLiteryTag key="maleNaglowki">Oblicz BMI</moje:maleLiteryTag></a></li>

        </ul>
    </div>
</nav>
<div class="container">
    <form method="GET" action="config">
        <moje:maleLiteryTag key="maleLitery"><h1>Parametr 1</h1><br> </moje:maleLiteryTag>
        <moje:maleLiteryTag
                key="maleLitery">1.Czy napisy <b>na tej
            podstronie</b> maja być UpperCasem? Jeśli tak, zaznacz checkbox(jeśli nie pozostaw odznaczony)<br>
            a następnie nacisnij przycisk Zatwierdź na dole strony<br></moje:maleLiteryTag>
        <input type="checkbox" name="checkbox" id="checkbox"> <br>
        <br>
        <moje:maleLiteryTag key="maleLitery"><h1>Parametr 2</h1><br> </moje:maleLiteryTag>
        <moje:maleLiteryTag
                key="maleLitery">2.Czy napisy <b>w
            menu</b> maja być UpperCasem? Jeśli tak, zaznacz checkbox(jeśli nie pozostaw odznaczony)<br>
            a następnie nacisnij przycisk Zatwierdź na dole strony<br></moje:maleLiteryTag>
        <input type="checkbox" name="checkbox1" id="checkbox"> <br>
        <br>
        <moje:maleLiteryTag key="maleLitery"><h1>Parametr 3</h1><br> </moje:maleLiteryTag>
        <moje:maleLiteryTag
                key="maleLitery">3.Czy napisy <b>w nazwie
            aplikacji</b> maja być UpperCasem? Jeśli tak, zaznacz checkbox(jeśli nie pozostaw odznaczony)<br>
            a następnie nacisnij przycisk Zatwierdź na dole strony<br></moje:maleLiteryTag>
        <input type="checkbox" name="checkbox2" id="checkbox"> <br>
        <br>
        <moje:maleLiteryTag key="maleLitery"><h1>Parametr 4</h1><br> </moje:maleLiteryTag>
        <moje:maleLiteryTag key="maleLitery">4.Czy napisy <b>na
            przycisku</b> maja być UpperCasem? Jeśli tak, zaznacz checkbox(jeśli nie pozostaw odznaczony)<br>
            a następnie nacisnij przycisk Zatwierdź na dole strony<br></moje:maleLiteryTag>
        <input type="checkbox" name="checkbox3" id="checkbox"> <br>
        <br>
        <button type="submit" class=" btn btn-success"><moje:maleLiteryTag
                key="malePrzycisk">Zatwierdź</moje:maleLiteryTag></button>
    </form>

</div>
</body>
</html>
