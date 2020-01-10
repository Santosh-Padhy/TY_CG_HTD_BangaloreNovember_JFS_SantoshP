package com.capgemini.fms.services;

import java.util.List;

import com.capgemini.fms.bean.Schedular;
import com.capgemini.fms.dao.SchedularDao;
import com.capgemini.fms.dao.SchedularDaoImpl;

public class SchedularServicesImpl implements SchedularServices {
SchedularDao schedulardao=  new SchedularDaoImpl();
	@Override
	public boolean addData(Schedular schedular) {
		// TODO Auto-generated method stub
		return schedulardao.addData(schedular);
	}

	@Override
	public boolean removeData(int schedularid) {
		// TODO Auto-generated method stub
		return schedulardao.removeData(schedularid);
	}

	@Override
	public List<Schedular> getAllData(int schedularid) {
		// TODO Auto-generated method stub
		return schedulardao.getAllData(schedularid);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}//end of class
