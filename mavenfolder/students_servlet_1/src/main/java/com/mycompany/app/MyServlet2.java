package com.mycompany.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class MyServlet2 extends HttpServlet {

    /**
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	String username=req.getParameter("username");
    	String password=req.getParameter("password");
        PrintWriter writer = resp.getWriter();
        String html="<h1> HELLO "+username + "</h1> <br> " +"your password is=" +password;
        writer.println(html);
        System.out.println("inside second servlet");
    }
}