package com.tds.dao;

import java.util.List;

import com.tds.Exceptions.BidsException;
import com.tds.Exceptions.TendorException;
import com.tds.Exceptions.VendorException;
import com.tds.model.Bids;
import com.tds.model.Tendors;

public interface VendorIntr {
	void login() throws VendorException;
	List<Tendors> getCurrentTendors();
	String placeBid() throws TendorException, BidsException;
	String checkStatusOfBid() throws BidsException;
	List<Bids> checkyourBids();
}
