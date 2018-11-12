package com.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.IMApp;
import com.model.Person;

/**
 * Servlet implementation class EmployeeDeleteServlet
 */
public class EmployeeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("EmpDelServlet");
		long id = Long.parseLong(request.getParameter("id"));
		Person p = new Person();
		p.setId(id);
		List<Person> lst = new LinkedList<Person>();
		lst.add(p);
		IMApp ims = new IMApp();
		int i = ims.deleteRecord(lst);
		if(i>0) {
			System.out.println("Delete Succesfull");
			response.sendRedirect("Home.Jsp");
		}
		else {
			System.out.println("Delete UnSuccesfull");
			response.sendRedirect("EmployeeDelete.Jsp");
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
