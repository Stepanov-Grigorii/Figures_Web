package ru.figures.servlet;

import ru.figures.StaticList;
import ru.figures.model.ClosedFigure;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Comparator;

public class PrintSortedListServlet extends HttpServlet {
    Comparator<ClosedFigure> comparator = Comparator.comparing(ClosedFigure::getPriority).thenComparing(ClosedFigure::getArea);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        if(StaticList.closedFigures.isEmpty()){
            System.out.println("List is empty.");
        } else {
            StaticList.closedFigures.stream().sorted(comparator).forEach(System.out::println);
        }
    }
}