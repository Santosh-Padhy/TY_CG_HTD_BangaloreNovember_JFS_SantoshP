package com.capg.thread.creatingThread;

public class User1 extends  Thread {
IRCTC i1;

public User1(IRCTC i1) {
	super();
	this.i1 = i1;
}
synchronized public void run()
{
	i1.confirmTicket();
}
}
