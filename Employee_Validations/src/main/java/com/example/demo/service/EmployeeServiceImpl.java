package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	@Override
	public List<Employee> addEmployees(List<Employee> employees) {
		return empRepo.saveAll(employees);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public String deleteEmployee(int employeeId) {
		empRepo.deleteById(employeeId);
		return  employeeId+" deleted Successfully";
	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		Optional<Employee> opt=empRepo.findById(employeeId);
		if(opt.isPresent()) {
			return opt.get();
		}
		return opt.get();
	}

	@Override
	public String deleteAllEmployees() {
		empRepo.deleteAll();
		return "All Employees are Deleted";
	}

}
