package com.neo;

class MultiThreading1 extends Thread{
	
	public void run() {
		System.out.println("Call MultiThreading1");
	}
}

class MultiThreading2 extends Thread{
	
	public void run() {
		System.out.println("Call MultiThreading2");
	}
}

public class Test {
	
	public static void main(String[] args) {
		
		MultiThreading1 mt=new MultiThreading1();
		mt.start();
		
	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
		
		MultiThreading2 mt1=new MultiThreading2();
		mt1.start();
	}

}
