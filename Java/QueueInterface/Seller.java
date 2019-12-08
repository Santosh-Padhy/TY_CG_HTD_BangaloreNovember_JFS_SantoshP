package com.collection.java;

public class Seller implements Comparable<Seller> {
	int sid;
	String sname;
	public Seller(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public int compareTo(Seller o) {
		if(this.sid>o.sid) {
			return 1;
		}else if(this.sid<o.sid) {
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Seller [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	
	
	

}
