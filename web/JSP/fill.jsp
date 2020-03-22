<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 22.03.2020
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fill</title>
</head>
<body>
    <div>
        <h1>Меню</h1>
        <ol>
            <li><a href="fill">Создать коллекцию фигур</a></li>
            <li><a href="print">Вывести фигуры</a></li>
            <li><a href="prints">Вывести фигуры в отсортированном порядке</a></li>
            <li><a href="printRTC">Вывести радиусы всех вписанных окружностей,
                площади треугольников, характеристики правильных фигур</a></li>
        </ol>
    </div>
    <p>${myStatus}</p>
</body>
</html>
