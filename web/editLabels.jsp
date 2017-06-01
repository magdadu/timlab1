<%@ page import="wat.edu.pl.LabelSingleton.LabelSingleton" %>
<%@ taglib prefix="c" uri="/META-INF/tlds/tags.tld" %>
<%--
  Created by IntelliJ IDEA.
  User: Magda
  Date: 24.05.2017
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
<div class="container">
    <form method="GET" action="edit">
        <h1>Edytuj etykiety</h1><br>
        <h3>Podaj nową nazwę dla etykiet:</h3><br>
        Dotychczasowa etykieta weight:<c:localizedTag key="weight"/> - Nowa nazwa:<input type="text" name="weight"
                                                                                         id="weight"> <br>
        Dotychczasowa etykieta height:<c:localizedTag key="height"/> - Nowa nazwa:<input type="text" name="height"
                                                                                         id="height"> <br>
        <br>
        <button type="submit" class=" btn btn-success">Zmień</button>
    </form>
</div>
</body>
</html>
