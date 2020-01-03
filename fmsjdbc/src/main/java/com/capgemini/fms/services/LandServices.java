package com.capgemini.fms.services;

import java.util.List;

import com.capgemini.fms.bean.Land;

public interface LandServices {
	public Land addLand(Land land);
	public boolean removeLand(long parcelId);
	public List<Land> getLand(Long parcelId);
}
