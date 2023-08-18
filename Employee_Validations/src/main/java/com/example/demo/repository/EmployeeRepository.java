package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	//@Query("From Employee e where e.name=1")
	public List<Employee>  findByName(String name);
	
	public List<Employee> findByOrderByName();
	
	public List<Employee> findByOrderByNameDesc();
	
	public List<Employee> findByAddress(String address);
	
	public List<Employee>  findByOrderByAddress();
	
	public Employee findByAge(String age);
	
	public List<Employee> findByOrderByAge();

}
