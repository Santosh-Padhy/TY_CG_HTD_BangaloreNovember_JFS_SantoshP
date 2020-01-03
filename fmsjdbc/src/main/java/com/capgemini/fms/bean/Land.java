package com.capgemini.fms.bean;

public class Land {
private long parcelId;
private String parcelLocation;
public long getParcelId() {
	return parcelId;
}
public void setParcelId(long parcelId) {
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


