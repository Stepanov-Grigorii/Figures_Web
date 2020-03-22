package ru.figures.servlet;

import ru.figures.StaticList;
import ru.figures.model.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FillListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StaticList.closedFigures.add(ClosedFigureFactory.createRectangle(4.0, 5.0));
        StaticList.closedFigures.add(ClosedFigureFactory.createCircle(5));
        StaticList.closedFigures.add(ClosedFigureFactory.createPolygon(5, 6));
        StaticList.closedFigures.add(ClosedFigureFactory.createTriangle(4.0, 5.0, 6.0));
        StaticList.closedFigures.add(ClosedFigureFactory.createRectangle(5.0, 5.0));
        StaticList.closedFigures.add(ClosedFigureFactory.createPolygon(8, 17));
        StaticList.closedFigures.add(ClosedFigureFactory.createCircle(6));

        req.setAttribute("myStatus", "Фигуры загружены");
        req.getRequestDispatcher("JSP/fill.jsp").forward(req, resp);
    }
}