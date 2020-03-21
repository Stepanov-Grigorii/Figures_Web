package ru.figures.servlet;

import ru.figures.StaticList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        if(StaticList.closedFigures.isEmpty()){
            System.out.println("List is empty.");
        } else {
            StaticList.closedFigures.forEach((System.out::println));
        }
    }
}