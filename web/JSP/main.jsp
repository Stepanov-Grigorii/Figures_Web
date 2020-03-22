<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 22.03.2020
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
    <div>
        <p>Меню</p>
        <ol>
            <li><a href="print">Вывести фигуры</a></li>
            <li><a href="prints">Вывести фигуры в отсортированном порядке</a></li>
            <li><a href="printRTC">Вывести радиусы всех вписанных окружностей,
                площади треугольников, характеристики правильных фигур</a></li>
        </ol>
    </div>
    <p>${myStatus}</p>
</body>
</html>
