package com.tds.model;

public class Tendors {
	private int tendorID;
	private String status;
	private int vendorID;
	private String bidStatus;
	public Tendors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tendors(int tendorID, String status, int vendorID, String bidStatus) {
		super();
		this.tendorID = tendorID;
		this.status = status;
		this.vendorID = vendorID;
		this.bidStatus = bidStatus;
	}
	@Override
	public String toString() {
		return "Tendors [tendorID=" + tendorID + ", status=" + status + ", vendorID=" + vendorID + ", bidStatus="
				+ bidStatus + "]";
	}
	public int getTendorID() {
		return tendorID;
	}
	public void setTendorID(int tendorID) {
		this.tendorID = tendorID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getVendorID() {
		return vendorID;
	}
	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
	}
	public String getBidStatus() {
		return bidStatus;
	}
	public void setBidStatus(String bidStatus) {
		this.bidStatus = bidStatus;
	}
}
