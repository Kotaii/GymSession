package com.gym.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class BatchServlet
 */
public class BatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	} */
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Read the data from request object
		String timeSession = request.getParameter("timeSession");
		String password = request.getParameter("txtPassword");
		
		System.out.println("User Details: "+email+" "+password);
		
		response.setContentType("text/html");
		String loginTimeStamp = new Date().toString();
		String htmlResponse = "<center><h3>Welcome "+email+"</h3><p>You Logged in at "+loginTimeStamp+"</p></center>";
		
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);
		
	}
}
