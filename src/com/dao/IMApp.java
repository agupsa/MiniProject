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
	Statement s;
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
	
	public int deleteRecord(List<Person> lst) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			for(Person p:lst) {
				ps = con.prepareStatement("select role from employee where emp_id=?");
				ps.setLong(1,p.getId());
				rs = ps.executeQuery();
				rs.next();
				if(!(rs.getString(1).equals("admin"))) {
					ps = con.prepareStatement("delete from employee where emp_id=?");
					ps.setLong(1,p.getId());
					i = ps.executeUpdate();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return i;
	}
	
	public int insertRecords(List<Object> lst)
	{
		System.out.println("dbsave1");
		int i=0;
		if (lst!=null && lst.get(0) instanceof Employee) {
			
				try {
					ps = con.prepareStatement("Insert into employee values(?,?,?,?,?,?,?,?,?,?)");
					for(Employee e:(List<Employee>)(Object)lst) {
						ps.setLong(1,e.getPer().getId());
						ps.setString(2, e.getPer().getName());
						ps.setInt(3, e.getPer().getAge());
						ps.setString(4, e.getPer().getAdd());
						ps.setLong(5, e.getPer().getMob());
						ps.setDate(6, e.getDoj());
						ps.setFloat(7, e.getSal());
						ps.setString(8, e.getRole());
						ps.setString(9, e.getL().getUsername());
						ps.setString(10, e.getL().getPassword());
						i=ps.executeUpdate();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}catch(Exception e) {
					e.printStackTrace();
				}
			
						
		}
		else if (lst instanceof Customer) {
			
			
		}
		else if (lst instanceof Item) {
			
			
		}else if (lst instanceof Bill) {
			
			
		}
		
		
			return i;
	}
	public List<Employee> getAllRecords() {
		List<Employee> lst = new LinkedList<>();
		
		try {
			s=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs = s.executeQuery("select * from EMPLOYEE");
			while(rs.next()) {
				Employee e = new Employee();
				Person per = new Person();
				Login l = new Login();
				per.setId(rs.getLong(1));
				per.setName(rs.getString(2));
				per.setAge(rs.getInt(3));
				per.setAdd(rs.getString(4));
				per.setMob(rs.getLong(5));
				e.setPer(per);
				e.setDoj(rs.getDate(6));
				e.setSal(rs.getFloat(7));
				e.setRole(rs.getString(8));
				l.setUsername(rs.getString(9));
				l.setPassword(rs.getString(10));
				e.setL(l);
				lst.add(e);
				System.out.println(rs.toString());
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lst;
	}
	
	
	
	
	
}
