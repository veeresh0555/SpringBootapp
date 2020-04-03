package com.emp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

@RestController
@RequestMapping("employeactivities/api")
public class TestRestController {

	
	@Autowired
	EmployeeService empservice;
	
	@GetMapping
	public String getMessage() {
		return "Hi.....This is first";
	}
	@GetMapping("/msg2")
	public String getMessag2() {
		return "Hi.....This is Second";
	}
	
	
	@GetMapping("/allemployees")
	public ResponseEntity<?> getAllEmployees() {
		
		List<Employee> empList=empservice.getAllemployees();
		
		//return new ResponseEntity.of(empList,HttpStatus.OK);
		
		return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
	}
	@PostMapping("/empsave")
	public Optional<Employee> empsaveOrUpdate(Employee emp){
		emp=empservice.empsaveOrUpdate(emp);
		System.out.println(""+emp.getEmpid());
		return Optional.of(emp);
	}
	
	
	
	
	
	
	
	
	
	
}
