package com.capgemini.fms.factory;

import com.capgemini.fms.dao.SchedularDao;
import com.capgemini.fms.dao.SchedularDaoImpl;
import com.capgemini.fms.services.SchedularServices;
import com.capgemini.fms.services.SchedularServicesImpl;

public class SchedularFactory {

	public static SchedularDao instanceOfSchedularDaoImpl() {
		SchedularDao schedulardao  = new SchedularDaoImpl();
		return  schedulardao;
	}
	public static SchedularServices instanceOfSchedularServicesImpl() {
		SchedularServices schedularservices = new SchedularServicesImpl();
		return schedularservices;
		
	}
		
}//end of class
