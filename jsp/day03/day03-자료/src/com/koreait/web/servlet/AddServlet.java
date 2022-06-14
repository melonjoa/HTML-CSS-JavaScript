package com.koreait.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
		
		String xStr = arg0.getParameter("x");
		String yStr = arg0.getParameter("y");
		
		System.out.println("xStr : " + xStr);
		System.out.println("yStr : " + yStr);
		
		int x = 0;
		int y = 0;
		
		if( xStr != null && !xStr.equals("") ) {
			x = Integer.parseInt(xStr);
			System.out.println("x : " + x);
		}
		
		if( yStr != null && !yStr.equals("") ) {
			y = Integer.parseInt(yStr);
			System.out.println("y : " + y); 
		}
		
		int result = x + y;
		System.out.println("result : " + result);
		arg1.getWriter().println("result is " + result);
	}
}















