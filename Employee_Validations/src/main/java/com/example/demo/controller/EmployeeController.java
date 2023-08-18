package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<Employee> addEmployee(@RequestBody @Valid Employee employee){
		ResponseEntity<Employee> resp=null;
		try {
			Employee emp1=employeeService.addEmployee(employee);
			resp=new ResponseEntity<Employee>(emp1,HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			resp=new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
		}
		return resp;
	}
	
	
	@PostMapping("/updateEmployee/{employeeId}")
	public ResponseEntity<Employee> addEmployee(@RequestBody @Valid Employee employee,@PathVariable int employeeId){
		ResponseEntity<Employee> resp=null;
		try {
			employee.setEmployeeId(employeeId);
			Employee emp1=employeeService.addEmployee(employee);
			resp=new ResponseEntity<Employee>(emp1,HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			resp=new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
		}
		return resp;
	}
	
	@GetMapping("/getAllEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		ResponseEntity<List<Employee>> resp=null;
		try {
			List<Employee> emps=employeeService.getAllEmployees();
			resp=new ResponseEntity<List<Employee>>(emps,HttpStatus.ACCEPTED);
		}catch(Exception e) {
			e.printStackTrace();
			resp=new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		return resp;
	}
	
	@GetMapping("/getEmployeeById/{employeeId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int employeeId){
		ResponseEntity<Employee> resp=null;
		try {
			Employee emp=employeeService.getEmployeeById(employeeId);
			resp=new ResponseEntity<Employee>(emp,HttpStatus.ACCEPTED);
		}catch(Exception e) {
			e.printStackTrace();
			resp=new  ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		return resp;
	}
	
	
	@DeleteMapping("/deleteEmployee/{employeeId}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable int employeeId){
		ResponseEntity<String> resp=null;
		try {
			resp=new ResponseEntity<String>(employeeService.deleteEmployee(employeeId),HttpStatus.ACCEPTED);
		}catch(Exception e) {
			e.printStackTrace();
			resp=new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		return resp;
	}
	
	@PostMapping("/saveAllEmployees")
	public ResponseEntity<List<Employee>> addEmployee(@RequestBody List<Employee> employees){
		ResponseEntity<List<Employee>>resp=null;
		try {
			List<Employee> emps=employeeService.addEmployees(employees);
			resp=new ResponseEntity<List<Employee>>(emps,HttpStatus.ACCEPTED);
		}catch(Exception e) {
			e.printStackTrace();
			resp=new ResponseEntity<List<Employee>>(HttpStatus.NOT_ACCEPTABLE);
		}
		return resp;
	}
	
	@DeleteMapping("/deleteAllEmployees")
	public ResponseEntity<String> deleteAllEmployees(){
		ResponseEntity<String> resp=null;
		try {
			resp=new ResponseEntity<String>(employeeService.deleteAllEmployees(),HttpStatus.ACCEPTED);
		}catch(Exception e) {
			e.printStackTrace();
			resp=new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		}
		return resp;
	}
	
	@GetMapping("/findByName/{name}")
	public ResponseEntity<List<Employee>> findByName(@PathVariable String name){
		ResponseEntity<List<Employee>> resp=null;
		try {
			List<Employee> emps=employeeService.findByName(name);
			resp=new ResponseEntity<List<Employee>>(emps,HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			resp=new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
		}
		return resp;
	}
	
	@GetMapping("/findByOrderByName")
	public ResponseEntity<List<Employee>> findByOrderByName(){
		ResponseEntity<List<Employee>>  resp=null;
		try {
			resp=new ResponseEntity<List<Employee>>(employeeService.findByOrderByName(),HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			resp=new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
		}
		return resp;
	}
	
	@GetMapping("/findByOrderByNameDesc")
	public ResponseEntity<List<Employee>> findByOrderByNameDesc(){
		ResponseEntity<List<Employee>>  resp=null;
		try {
			resp=new ResponseEntity<List<Employee>>(employeeService.findByOrderByNameDesc(),HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			resp=new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
		}
		return resp;
	}
	

}
