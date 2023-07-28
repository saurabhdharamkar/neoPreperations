package com.neo;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();  
		list.add(new Student(15,28,"Saurabh","Pune"));  
		list.add(new Student(10,37,"Nikhil","Akola"));  
		list.add(new Student(8,18,"Raj","Mumbai"));  
		
		System.out.println("-------Sort By Id------");
		
		Collections.sort(list, new SortById());
		
		for(Student st:list) {
			System.out.println(st.id+" "+st.age+" "+st.name+" "+st.address);
		}
		System.out.println("----------------");
		
        System.out.println("--------Sort By Age--------");
		
		Collections.sort(list, new SortByAge());
		
		for(Student st:list) {
			System.out.println(st.id+" "+st.age+" "+st.name+" "+st.address);
		}
		System.out.println("-----------------");
		
        System.out.println("--------Sort By Name---------");
		
		Collections.sort(list, new SortByName());
		
		for(Student st:list) {
			System.out.println(st.id+" "+st.age+" "+st.name+" "+st.address);
		}
		System.out.println("---------------");
         System.out.println("---------Sort By Address-----------");
		
		Collections.sort(list, new SortByAddress());
		
		for(Student st:list) {
			System.out.println(st.id+" "+st.age+" "+st.name+" "+st.address);
		}
	}

}
