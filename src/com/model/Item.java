package com.model;

import java.sql.Date;

public class Item{
	private long itemId;
	private String itemName;
	private int itemQuantity;
	private String itemQuantityUnit;
	private Date itemDOM, itemDOE;
	private float itemCP, itemSP, itemDisc, itemTax;
	private int itemStock;
	private String itemCategory;
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public String getItemQuantityUnit() {
		return itemQuantityUnit;
	}
	public void setItemQuantityUnit(String itemQuantityUnit) {
		this.itemQuantityUnit = itemQuantityUnit;
	}
	public Date getItemDOM() {
		return itemDOM;
	}
	public void setItemDOM(Date itemDOM) {
		this.itemDOM = itemDOM;
	}
	public Date getItemDOE() {
		return itemDOE;
	}
	public void setItemDOE(Date itemDOE) {
		this.itemDOE = itemDOE;
	}
	public float getItemCP() {
		return itemCP;
	}
	public void setItemCP(float itemCP) {
		this.itemCP = itemCP;
	}
	public float getItemSP() {
		return itemSP;
	}
	public void setItemSP(float itemSP) {
		this.itemSP = itemSP;
	}
	public float getItemDisc() {
		return itemDisc;
	}
	public void setItemDisc(float itemDisc) {
		this.itemDisc = itemDisc;
	}
	public float getItemTax() {
		return itemTax;
	}
	public void setItemTax(float itemTax) {
		this.itemTax = itemTax;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	
	
}
