package com.capgemini.fms.services;

import java.util.List;

import com.capgemini.fms.bean.Schedular;

public interface SchedularServices {
	public boolean addData(Schedular schedular);
	public boolean removeData(int schedularid);
	public List<Schedular> getAllData(int schedularid);
	
}
