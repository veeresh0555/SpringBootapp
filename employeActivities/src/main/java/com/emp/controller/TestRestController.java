package com.emp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.exception.RecordNotFoundException;
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
	public ResponseEntity<?> getAllEmployees() throws RecordNotFoundException {
		
		List<Employee> empList=empservice.getAllemployees();
		
		//return new ResponseEntity.of(empList,HttpStatus.OK);
		
		return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getempById(@PathVariable("id") long empid) throws RecordNotFoundException{
		//Optional<Employee> empById=empservice.getempById(empid);
		
		//Optional<Employee> empById = null;
		//try {
			Employee empById=empservice.getempById(empid);
		//} catch (Exception e) {
			//throw new RecordNotFoundException("rnf");
		//}
		//System.out.println("EmpById: "+empById.get());
		return new ResponseEntity<>(empById,new HttpHeaders(), HttpStatus.OK);
	}
	
	
	
	@PostMapping("/empsave")
	public Optional<Employee> empsaveOrUpdate(Employee emp){
		emp=empservice.empsaveOrUpdate(emp);
		System.out.println(""+emp.getEmpid());
		return Optional.of(emp);
	}
	
	
	
	
	
	
	
	
	
	
}
