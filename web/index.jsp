<%@ page import="wat.edu.pl.LabelSingleton.LabelSingleton" %><%--
  Created by IntelliJ IDEA.
  User: Magda
  Date: 06.05.2017
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DietCenter</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="css/style.css" type="text/css"></script>

</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="index.jsp">YourBMI</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="index.jsp">Strona główna</a></li>
            <li>
                <a href="editLabels.jsp">Edycja etykiet</a></li>
            <li><a href="configure.jsp">Konfiguracja</a></li>
            <li><a href="history.jsp">Historia Operacji</a></li>
            <li><a href="bmi.jsp">Oblicz BMI</a></li>
        </ul>
    </div>
</nav>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="container">
        <h3>Oblicz swoje BMI!</h3>
        <!-- Wrapper for slides -->
        <div class="carousel-inner" style="max-width: 900px; margin: 0 auto">
            <div class="item active">
                <img src="images/salad1.jpg">
            </div>

            <div class="item">
                <img src="images/salad0.jpg">
            </div>

            <div class="item">
                <img src="images/salad2.jpg">
            </div>
        </div>

        <!-- Left and right controls -->
        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>
<footer>
    Copyright Magdalena Duchnik
</footer>
</body>
</html>
