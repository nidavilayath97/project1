package com.mycompany.app;
import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import java.io.IOException;
	import java.io.PrintWriter;

	@WebServlet("/first")
	public class MyServlet1 extends HttpServlet {

	    /**
	     * @throws ServletException
	     * @throws IOException
	     */
	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
	    	RequestDispatcher dispacher=req.getRequestDispatcher("/second");
	    	dispacher.forward(req,resp);
	
	}
	}



