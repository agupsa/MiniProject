package com.model;

import java.sql.Date;

public class Employee{
	private Person per;
	private Date doj;
	private float sal;
	private String role;
	private Login l;
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Login getL() {
		return l;
	}
	public void setL(Login l) {
		this.l = l;
	}
	
	

}
