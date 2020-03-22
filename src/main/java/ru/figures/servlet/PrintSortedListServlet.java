package ru.figures.servlet;

import ru.figures.StaticList;
import ru.figures.model.ClosedFigure;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Collectors;

public class PrintSortedListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(StaticList.closedFigures.isEmpty()){
            System.out.println("List is empty.");
        } else {
            Comparator<ClosedFigure> comparator = Comparator.comparing(ClosedFigure::getPriority).thenComparing(ClosedFigure::getArea);
            StaticList.closedFigures.stream().sorted(comparator).forEach(System.out::println);
            req.setAttribute("mySortedFigures", StaticList.closedFigures.stream().sorted(comparator).collect(Collectors.toList()));
            req.getRequestDispatcher("JSP/sortedFigures.jsp").forward(req, resp);
        }
    }
}