package com.tds.dao;

import java.util.List;

import com.tds.Exceptions.AdminException;
import com.tds.Exceptions.TendorException;
import com.tds.Exceptions.VendorException;
import com.tds.model.Bids;
import com.tds.model.Tendors;
import com.tds.model.Vendors;

public class AdminImpl implements AdminIntr{

	@Override
	public void login() throws AdminException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String addVendor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendors> getAllVendors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNewTendor() throws TendorException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Tendors> getAllTendors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bids> getBidsByTendors() throws TendorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String assignVendorATendor() throws TendorException, VendorException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
