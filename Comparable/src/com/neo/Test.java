package com.neo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements  Comparable< Student>{
	
	private int id;
	
	private int age;
	private String name;
	private String address;
	
	public Student(int id,int age, String name, String address) {
		super();
		this.id = id;
		this.age=age;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if(age>o.age) {
			return 1;
		}else if(age==o.age) {
			return 0;
		}else {
			return -1;
		}
	}

	
}

public class Test {
	
	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(12,26,"Saurabh","Pune"));
		list.add(new Student(10,28,"Shubham","Ahmedabad"));
		list.add(new Student(8,22,"Kartik","Mumbai"));
		
		Collections.sort(list);
		
		for(Student std:list) {
			System.out.println(std.getId()+" "+std.getAge()+" "+std.getName()+" "+std.getAddress());
		}
	}

}
