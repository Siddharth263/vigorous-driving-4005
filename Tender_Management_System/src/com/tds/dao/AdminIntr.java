package com.tds.dao;

import java.util.List;

import com.tds.Exceptions.AdminException;
import com.tds.Exceptions.TendorException;
import com.tds.Exceptions.VendorException;
import com.tds.model.Bids;
import com.tds.model.Tendors;
import com.tds.model.Vendors;

public interface AdminIntr {
	void login() throws AdminException;
	String addVendor();
	List<Vendors> getAllVendors();
	void addNewTendor() throws TendorException;
	List<Tendors> getAllTendors();
	List<Bids> getBidsByTendors() throws TendorException;
	String assignVendorATendor() throws TendorException, VendorException;
}
