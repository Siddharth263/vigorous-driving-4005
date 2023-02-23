package com.tds.model;

public class Bids {
	private int bidID;
	private int tendorID;
	private int highestBid;
	private int lowestBid;
	public Bids() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bids(int bidID, int tendorID, int highestBid, int lowestBid) {
		super();
		this.bidID = bidID;
		this.tendorID = tendorID;
		this.highestBid = highestBid;
		this.lowestBid = lowestBid;
	}
	@Override
	public String toString() {
		return "Bids [bidID=" + bidID + ", tendorID=" + tendorID + ", highestBid=" + highestBid + ", lowestBid="
				+ lowestBid + "]";
	}
	public int getBidID() {
		return bidID;
	}
	public void setBidID(int bidID) {
		this.bidID = bidID;
	}
	public int getTendorID() {
		return tendorID;
	}
	public void setTendorID(int tendorID) {
		this.tendorID = tendorID;
	}
	public int getHighestBid() {
		return highestBid;
	}
	public void setHighestBid(int highestBid) {
		this.highestBid = highestBid;
	}
	public int getLowestBid() {
		return lowestBid;
	}
	public void setLowestBid(int lowestBid) {
		this.lowestBid = lowestBid;
	}
}
