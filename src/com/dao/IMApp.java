package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.model.*;

public class IMApp {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public IMApp() {
		super();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Newuser123");
			System.out.println("Connected to db...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		
		try {
			con.close();
			System.out.println("Disconnected from db...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}
	public boolean login(Login l) {
		Login fl = new Login();
		
		try {
			System.out.println("in method");
			ps = con.prepareStatement("Select password from EMPLOYEE where username=?");
			ps.setString(1,l.getUsername());			
			rs = ps.executeQuery();
			rs.next();
			fl.setPassword(rs.getString(1));
			System.out.println("Got password from server");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(fl.getPassword().equals(l.getPassword())) {
			System.out.println("password match");
			return true;
			
		}
		
		System.out.println("password mismatch");
		return false;
	}
	
	
	public int insertReccords(List lst)
	{
		System.out.println("dbsave1");
		int i=0;
		if (lst!=null && lst.get(0) instanceof Employee) {
			try {
				ps = con.prepareStatement("Insert into employee values(?,?,?,?,?,?,?)");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for(Employee e:(List<Employee>)lst) {
				
			}
			
		}
		else if (lst instanceof Customer) {
			
			
		}
		else if (lst instanceof Item) {
			
			
		}else if (lst instanceof Bill) {
			
			
		}
		
		
			return i;
	}
	/*public List<Register> getAllData()
	{
		List<Register> lst=new LinkedList<Register>();
		con=myConnection();
		try
		{
		Statement s=
					con.createStatement
					(ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_READ_ONLY);
			rs=s.executeQuery("select * from Registration");
			while(rs.next())
			{
				Register a=new Register();
				a.setRno(rs.getInt(1));
				a.setFname(rs.getString(2));
				a.setPass(rs.getString(3));
				a.setBal(rs.getDouble(4));
				lst.add(a);
				System.out.println("cnt");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return lst;
	}
	public boolean validateUser(Login l)
	{
		myConnection();
		List<Register> lst=getAllData();
		boolean b=false;
		for(Register r:lst)
		{
			if(r.getRno()==l.getRno())
			{
				if(r.getPass().equals(l.getPass()))
				{
					b=true;
					break;
				}
			}
		}
		return b;
	}
	*/
	
	
	
}
