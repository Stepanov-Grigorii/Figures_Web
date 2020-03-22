package ru.figures.servlet;

import ru.figures.StaticList;
import ru.figures.model.CircInsFigure;
import ru.figures.model.CorrectFigure;
import ru.figures.model.Triangle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;

public class PrintRTCServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(StaticList.closedFigures.isEmpty()){
            System.out.println("List is empty.");
        } else {
            StaticList.closedFigures.stream()
                                    .filter(c -> c instanceof CircInsFigure)
                                    .map(c -> (CircInsFigure) c)
                                    .forEach(f -> System.out.println(f + " radius = " + f.getRadiusOfInscribedCircle()));
            StaticList.closedFigures.stream()
                                    .filter(c -> c instanceof Triangle)
                                    .map(c -> (Triangle) c)
                                    .forEach(f -> System.out.println(f + " area = " + f.getArea()));
            StaticList.closedFigures.stream()
                                    .filter(c -> c instanceof CorrectFigure)
                                    .map(c -> (CorrectFigure) c)
                                    .forEach(f -> System.out.println(f + " length = " + f.getLength() + " number of sides = " + f.getNumberOfSides()));

            req.setAttribute("myFiguresR", StaticList.closedFigures.stream()
                                                                      .filter(c -> c instanceof CircInsFigure)
                                                                      .map(c -> (CircInsFigure) c)
                                                                      .map(f -> f + " radius = " + f.getRadiusOfInscribedCircle())
                                                                      .collect(Collectors.toList()));
            req.setAttribute("myFiguresT", StaticList.closedFigures.stream()
                                                                      .filter(c -> c instanceof Triangle)
                                                                      .map(c -> (Triangle) c)
                                                                      .map(f -> f + " area = " + f.getArea())
                                                                      .collect(Collectors.toList()));
            req.setAttribute("myFiguresC", StaticList.closedFigures.stream()
                                                                      .filter(c -> c instanceof CorrectFigure)
                                                                      .map(c -> (CorrectFigure) c)
                                                                      .map(f -> f + " length = " + f.getLength() + " number of sides = " + f.getNumberOfSides())
                                                                      .collect(Collectors.toList()));
            req.getRequestDispatcher("JSP/figuresRTC.jsp").forward(req, resp);
        }
    }
}