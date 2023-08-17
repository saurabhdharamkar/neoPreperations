package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	public List<Employee> addEmployees (List<Employee> employess);
	
	public List<Employee> getAllEmployees();
	
	public String deleteEmployee(int employeeId);
	
	public Employee getEmployeeById(int employeeId);
	
	public String deleteAllEmployees();
}
