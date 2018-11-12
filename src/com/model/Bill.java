package com.model;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

public class Bill {
	private long billId;
	private String billName;
	private Date billDate;
	private String billPaymentDetails;
	private char billType;
	private float billTotal;
	private List<Item> items = new LinkedList<Item>();
	public long getBillId() {
		return billId;
	}
	public void setBillId(long billId) {
		this.billId = billId;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public String getBillPaymentDetails() {
		return billPaymentDetails;
	}
	public void setBillPaymentDetails(String billPaymentDetails) {
		this.billPaymentDetails = billPaymentDetails;
	}
	public char getBillType() {
		return billType;
	}
	public void setBillType(char billType) {
		this.billType = billType;
	}
	public float getBillTotal() {
		return billTotal;
	}
	public void setBillTotal(float billTotal) {
		this.billTotal = billTotal;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	

}
