package com.capgemini.fms.bean;

public class Land {
private int parcelId;
private String parcelLocation;
public int getParcelId() {
	return parcelId;
}
public void setParcelId(int parcelId) {
	this.parcelId = parcelId;
}
public String getParcelLocation() {
	return parcelLocation;
}
public void setParcelLocation(String parcelLocation) {
	this.parcelLocation = parcelLocation;
}
@Override
public String toString() {
	return "Land [parcelId=" + parcelId + ", parcelLocation=" + parcelLocation + "]";
}


}


