package com.capgemini.fms.factory;

import com.capgemini.fms.dao.LandDao;
import com.capgemini.fms.dao.LandDaoImpl;
import com.capgemini.fms.services.LandServices;
import com.capgemini.fms.services.LandServicesImpl;

public class LandFactory {
public static LandDao instanceOfLandDaoImpl() {
	LandDao landdao = new LandDaoImpl();
	return landdao;
}
 public static LandServices instanceOfLandServiceImpl() {
	 LandServices landservices = new LandServicesImpl();
	 return landservices;
 }
}
