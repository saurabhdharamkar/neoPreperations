package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name="employee_tbl")
@AllArgsConstructor
@Setter
@Getter
public class Employee {
	
	public Employee() {
	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private int employeeId;
	
	@NotEmpty(message = "Name is required")
	@Column(name="name")
	private String name;
	
	@NotEmpty(message = "Company Name is required")
	@Column(name="company_name")
	private String companyName;
	
	@NotEmpty(message = "Address  is required")
	@Size(min = 20,max=40, message = "Address must be at least 20 digits")
	@Column(name="address")
	private String address;
	
	@NotEmpty(message = "Email Id  is required")
	@Email(message = "Invalid email format")
	@Column(name="email_id")
	private String emailId;
	
	@NotEmpty(message = "Mobile No  is required")
	@Size(min = 10, message = "Mobile No must be at least 10 digits")
	@Column(name="mobile_no")
	private String mobileNo;
	
	@NotEmpty(message = "Age  is required")
	@Column(name="age")
	private String age;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", companyName=" + companyName + ", address="
				+ address + ", emailId=" + emailId + ", mobileNo=" + mobileNo + ", age=" + age + "]";
	}
	
	

}
