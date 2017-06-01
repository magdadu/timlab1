<%@ taglib prefix="c" uri="/META-INF/tlds/tags.tld" %>
<%--
  Created by IntelliJ IDEA.
  User: Magda
  Date: 23.05.2017
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
    <form method="GET" action="bmi">
        <h1>Oblicz swoje BMI</h1>

        <c:localizedTag key="weight"/>(kg) : <input type="text" name="weight" id="weight"> <br>
        <c:localizedTag key="height"/>(cm) : <input type="text" name="height" id="height"> <br>
        <br>
        <button type="submit" class=" btn btn-success">OBLICZ</button>
    </form>

</div>
</body>
</html>
