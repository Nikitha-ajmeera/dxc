package com.dxc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int firstNo, secondNo, result;
		PrintWriter out = response.getWriter();
		firstNo = Integer.parseInt(request.getParameter("firstNo"));
		secondNo = Integer.parseInt(request.getParameter("secondNo"));
		result = firstNo +secondNo;
		out.println("Sum is  " +result + "<br/>");
		result = firstNo - secondNo;
		out.println("Sub is  " +result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
