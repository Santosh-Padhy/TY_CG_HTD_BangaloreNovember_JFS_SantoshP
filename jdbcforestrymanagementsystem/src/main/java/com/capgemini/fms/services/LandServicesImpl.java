package com.capgemini.fms.services;

import java.util.List;

import com.capgemini.fms.bean.Land;
import com.capgemini.fms.dao.LandDao;
import com.capgemini.fms.factory.FmsFactory;
import com.capgemini.fms.factory.LandFactory;

public class LandServicesImpl implements LandServices {
LandDao landdao = LandFactory.instanceOfLandDaoImpl();
	public Land addLand(Land land) {
		// TODO Auto-generated method stub
		return landdao.addLand(land);
	}

	public boolean removeLand(int parcelId) {
		// TODO Auto-generated method stub
		return landdao.removeLand(parcelId);
	}

	public List<Land> getLand(int parcelId) {
		// TODO Auto-generated method stub
		return landdao.getLand(parcelId);
		
	}

}
