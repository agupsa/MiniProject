package com.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.IMApp;
import com.model.Employee;
import com.model.Login;
import com.model.Person;

/**
 * Servlet implementation class EmployeeRegistrationServlet
 */
public class EmployeeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside ERegServlet");
		long id = Long.parseLong(request.getParameter("id"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String add = request.getParameter("add");
		long mob = Long.parseLong(request.getParameter("mob"));
		java.util.Date tempdoj = null;
		try {
			tempdoj = new SimpleDateFormat("yyyy-mm-dd").parse(request.getParameter("doj"));
			System.out.println("got date");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date doj = new Date(tempdoj.getTime());
		float sal = Float.parseFloat(request.getParameter("sal"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Login l = new Login();
		Person p = new Person();
		Employee e = new Employee();
		p.setId(id);
		p.setName(name);
		p.setAge(age);
		p.setAdd(add);
		p.setMob(mob);
		l.setUsername(username);
		l.setPassword(password);
		e.setPer(p);
		e.setL(l);
		e.setDoj(doj);
		e.setSal(sal);
		e.setRole("user");
		List<Object> lst = new LinkedList<Object>();
		lst.add(e);
		System.out.println("model object created");
		
		IMApp ims = new IMApp();
		int i = ims.insertRecords(lst);
		if(i>0) {
			System.out.println("Data Added");
			response.sendRedirect("Home.jsp");
		}
		else{
			System.out.println("Data NOT Added");
			response.sendRedirect("EmployeeRegistration.jsp");
		}
		
		
	}

}
