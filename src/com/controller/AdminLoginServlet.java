package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dao.IMApp;
import com.model.Login;

/**
 * Servlet implementation class AdminLoginServlet
 */
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("username");
		String s2=request.getParameter("password");
		System.out.println(s1+"\t"+s2);
		Login l=new Login();
		l.setUsername(s1);
		l.setPassword(s2);
		IMApp ims=new IMApp();
		boolean b=ims.login(l);
		if(b)
		{
			System.out.println("Login Sucessfull");
			response.sendRedirect("Home.jsp");
		}
		else
		{
			System.out.println("Login UnSucessfull");
			response.sendRedirect("AdminLogin.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
