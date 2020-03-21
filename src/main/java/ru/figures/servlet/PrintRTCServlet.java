package ru.figures.servlet;

import ru.figures.StaticList;
import ru.figures.model.CircInsFigure;
import ru.figures.model.CorrectFigure;
import ru.figures.model.Triangle;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.stream.Collectors;

public class PrintRTCServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        StaticList.closedFigures.stream().filter(c -> c instanceof CircInsFigure)
                .map(c -> (CircInsFigure) c)
                .collect(Collectors.toList()).forEach(f -> System.out.println(f.toString() + " radius = "
                + f.getRadiusOfInscribedCircle()));
        StaticList.closedFigures.stream().filter(c -> c instanceof Triangle)
                .map(c -> (Triangle) c)
                .collect(Collectors.toList()).forEach(f -> System.out.println(f.toString() + " area = "
                + f.getArea()));
        StaticList.closedFigures.stream().filter(c -> c instanceof CorrectFigure)
                .map(c -> (CorrectFigure) c)
                .collect(Collectors.toList()).forEach(f -> System.out.println(f.toString()
                + " length = " + f.getLength()
                + " number of sides = " + f.getNumberOfSides()));
    }
}