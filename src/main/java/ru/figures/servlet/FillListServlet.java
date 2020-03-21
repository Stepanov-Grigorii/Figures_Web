package ru.figures.servlet;

import ru.figures.StaticList;
import ru.figures.model.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FillListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        StaticList.closedFigures.add(new Rectangle(4.0, 5.0));
        StaticList.closedFigures.add(new Circle(5));
        StaticList.closedFigures.add(new Polygon(5, 6));
        StaticList.closedFigures.add(new Triangle(4.0, 5.0, 6.0));
        StaticList.closedFigures.add(new Rectangle(5.0, 5.0));
        StaticList.closedFigures.add(new Polygon(8, 17));
        StaticList.closedFigures.add(new Circle(6));
    }
}