<%--
  Created by IntelliJ IDEA.
  User: Magda
  Date: 24.05.2017
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
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
    <h1>Historia Operacji</h1>
    <form method="GET" action="historia">
        <button type="submit" class=" btn btn-success">Historia</button>
    </form>
    <%
        Object historia = request.getAttribute("historia");
        if (historia != null) {
            out.print(historia);
        }
    %>
</div>
</body>
</html>
