package ru.figures.servlet;

import ru.figures.StaticList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PrintListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(StaticList.closedFigures.isEmpty()){
            System.out.println("List is empty.");
        } else {
            StaticList.closedFigures.forEach(System.out::println);
            req.setAttribute("myFigures", StaticList.closedFigures);
            req.getRequestDispatcher("JSP/figures.jsp").forward(req, resp);
        }
    }
}