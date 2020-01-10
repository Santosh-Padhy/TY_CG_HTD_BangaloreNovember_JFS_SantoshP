package com.capgemini.fms.dao;

import java.util.List;

import com.capgemini.fms.bean.Schedular;



public interface SchedularDao {
	public boolean addData(Schedular schedular);
	public boolean removeData(int schedularid);//clientid primary key	
	public List<Schedular> getAllData(int schedularid);
	
	
	
	
	
	
}//end of interface
