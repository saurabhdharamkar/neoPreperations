package com.neo;


class InterProcess{
	
	String  name=" ";
	
	synchronized void  addMessage(String msg) {
		this.name+=msg;
		System.out.println(this.name);
	}
	
	synchronized void anotherMessage(String msg) {
		this.name+=msg;
		System.out.println(this.name);
		notify();
	}
}
public class Test2 {
	
	public static void main(String[] args) {
		
		InterProcess ip=new InterProcess();
	
		new Thread(){  
		public void run(){ip.addMessage("Saurabh");}
	}.start();
	
	new Thread(){  
		public void run(){ip.anotherMessage("Dharamkar");}
	}.start();

		
	}
	
}
