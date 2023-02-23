package com.tds.model;

public class Vendors {
	private int vendorID;
	private String name;
	private String userName;
	private String password;
	private int phone;
	public Vendors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendors(int vendorID, String name, String userName, String password, int phone) {
		super();
		this.vendorID = vendorID;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Vendors [vendorID=" + vendorID + ", name=" + name + ", userName=" + userName + ", password=" + password
				+ ", phone=" + phone + "]";
	}
	public int getVendorID() {
		return vendorID;
	}
	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
}
