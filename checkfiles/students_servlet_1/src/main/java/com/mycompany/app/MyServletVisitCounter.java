package com.mycompany.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	
	@WebServlet(value="/visit")
			//initParams= {
					//@WebInitParam(name="visits", value="10")
				//})
	
	public class MyServletVisitCounter extends HttpServlet {
		private int visitsCounter;
		
		/*@Override
		private void init() throws ServletException{
			ServletConfig servletConfig=getServletConfig();
			String counterStr=servletConfig.getInitParameter("visits");
			visitsCounter=Integer.parseInt(counterStr);
			System.out.println("counterval=" +visitsCounter);
			
		}*/
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
			visitsCounter++;
			Util util=new Util();
			ServletContext context=getServletContext();
			util.incrementTotalVisits(context);
			
			PrintWriter writer=resp.getWriter();
			writer.println("visits to this servlet 1=" +visitsCounter);
			int total=util.getTotalVisitsCount(context);
			writer.println("total visits to this app = "+total );
		}

}
