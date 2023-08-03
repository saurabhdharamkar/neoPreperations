package com.nit;

//lazy
public class Singleton {

	// 1st
	private static Singleton INSTANCE = new Singleton();

	private Singleton() {

	}

	// 3rd static factory method

	public static Singleton getINSTANCE() {
		/*	//check
			if(INSTANCE==null) {
				INSTANCE=new Singleton();
			} */
		return INSTANCE;
	}
}
