package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emp.model.Employee;
import com.emp.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository empRepository;
	
	@Override
	public List<Employee> getAllemployees() {
		return empRepository.findAll();
	}

	@Override
	public Employee saveemp(Employee emp) {
		return empRepository.save(emp);
	}

}
