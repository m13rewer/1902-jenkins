package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
			ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		// PrintWriter: Allows me to write directly to the body of the response
		pw.write("<html><head><title>Hello World!</title></head><body>");
//		pw.write("<a href=\"index.html\">request a color</a></body></html>");
	}
	
}

