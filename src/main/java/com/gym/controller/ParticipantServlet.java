package com.gym.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ParticipantServlet
 */
public class ParticipantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParticipantServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Read the data from request object
		String email = request.getParameter("txtEmail");
		String name = request.getParameter("txtName");
		String phone = request.getParameter("txtPhone");
		String batch = request.getParameter("txtBid");
		
		System.out.println("User Details: "+email+" "+name);
	
		response.setContentType("text/html");
		String htmlResponse = "<center><h3>Welcome "+name+"</h3><p> Your Phone Number is: "+phone+" and your Batch ID is: "+batch+"</p></center>";
		
		PrintWriter out = response.getWriter();
		out.print(htmlResponse);
	 }
	}
	
