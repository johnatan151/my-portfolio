package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Welcome-message")
public class HelloWorld extends HttpServlet{
    private String message = "Hello World :) ";

    public void doGet(final HttpServletRequest request,final HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        response.getWriter().println("<p> this is my welcome message "+ message + "</p>");

    }
}