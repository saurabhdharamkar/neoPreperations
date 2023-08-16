package com.nit;

public class SingleTonTest {

	public static void main(String[] args) {
		Singleton sin=Singleton.getINSTANCE();
		Singleton sin2=Singleton.getINSTANCE();
		System.out.println(sin==sin2);

	}
}
