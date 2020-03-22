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
import java.util.List;
import java.util.stream.Collectors;

public class PrintRTCServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CircInsFigure> myFiguresR = StaticList.closedFigures.stream()
                                                                 .filter(c -> c instanceof CircInsFigure)
                                                                 .map(c -> (CircInsFigure) c)
                                                                 .collect(Collectors.toList());
        List<Triangle> myFiguresT = StaticList.closedFigures.stream()
                                                            .filter(c -> c instanceof Triangle)
                                                            .map(c -> (Triangle) c)
                                                            .collect(Collectors.toList());
        List<CorrectFigure> myFiguresC = StaticList.closedFigures.stream()
                                                                 .filter(c -> c instanceof CorrectFigure)
                                                                 .map(c -> (CorrectFigure) c)
                                                                 .collect(Collectors.toList());
        req.setAttribute("myFiguresR", myFiguresR);
        req.setAttribute("myFiguresT", myFiguresT);
        req.setAttribute("myFiguresC", myFiguresC);
        req.getRequestDispatcher("JSP/figuresRTC.jsp").forward(req, resp);
    }
}