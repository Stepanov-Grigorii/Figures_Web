<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 22.03.2020
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Sorted Figures</title>
</head>
<body>
    <div>
        <h1>Меню</h1>
        <ul>
            <li><a href="fill">Создать коллекцию фигур</a></li>
            <li><a href="print">Вывести фигуры</a></li>
            <li><a href="prints">Вывести фигуры в отсортированном порядке</a></li>
            <li><a href="printRTC">Вывести радиусы всех вписанных окружностей,
                площади треугольников, характеристики правильных фигур</a></li>
        </ul>
    </div>
    <h2>Отсортированный список фигур</h2>
    <ol>
        <c:choose>
            <c:when test = "${mySortedFigures.isEmpty()}">
                <p>Пусто</p>
            </c:when>
            <c:otherwise>
                <c:forEach var="figure" items="${mySortedFigures}">
                    <li>${figure}</li>
                </c:forEach>
            </c:otherwise>
        </c:choose>
    </ol>
</body>
</html>