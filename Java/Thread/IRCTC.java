package com.capg.thread.creatingThread;

public class IRCTC {
synchronized void confirmTicket()
{
	for(int i = 0;i<4;i++)
	{
		
	
	System.out.println(i);}
	
//	try {
//		wait();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	try {
		Thread.sleep(600);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

synchronized public void leaveMe()
{
	notifyAll();
	System.out.println("notify called");
}
}
