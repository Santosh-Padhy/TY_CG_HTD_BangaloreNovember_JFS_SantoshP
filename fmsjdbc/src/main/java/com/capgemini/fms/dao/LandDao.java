package com.capgemini.fms.dao;

import java.util.List;

import com.capgemini.fms.bean.Land;

public interface LandDao {
public Land addLand(Land land);
public boolean removeLand(long parcelId);
public List<Land> getLand(Long parcelId);
}
