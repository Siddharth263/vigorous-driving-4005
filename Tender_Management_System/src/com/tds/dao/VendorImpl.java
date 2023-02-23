package com.tds.dao;

import java.util.List;

import com.tds.Exceptions.BidsException;
import com.tds.Exceptions.TendorException;
import com.tds.Exceptions.VendorException;
import com.tds.model.Bids;
import com.tds.model.Tendors;

public class VendorImpl implements VendorIntr{

	@Override
	public void login() throws VendorException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Tendors> getCurrentTendors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String placeBid() throws TendorException, BidsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkStatusOfBid() throws BidsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bids> checkyourBids() {
		// TODO Auto-generated method stub
		return null;
	}

}
