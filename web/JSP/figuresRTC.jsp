<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 22.03.2020
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Figures RTC</title>
</head>
<body>
    <div>
        <h1>Меню</h1>
        <ul>
            <li><a href="print">Вывести фигуры</a></li>
            <li><a href="prints">Вывести фигуры в отсортированном порядке</a></li>
            <li><a href="printRTC">Вывести радиусы всех вписанных окружностей,
                площади треугольников, характеристики правильных фигур</a></li>
        </ul>
    </div>
    <h1>Радиусы вписанных окружностей, площади треугольников, характеристики правильных фигур</h1>
    <ol>
        <c:forEach var="figure" items="${myFiguresR}">
            <li>${figure}</li>
        </c:forEach>
    </ol>
    <ol>
        <c:forEach var="figure" items="${myFiguresT}">
            <li>${figure}</li>
        </c:forEach>
    </ol>
    <ol>
        <c:forEach var="figure" items="${myFiguresC}">
            <li>${figure}</li>
        </c:forEach>
    </ol>
</body>
</html>
