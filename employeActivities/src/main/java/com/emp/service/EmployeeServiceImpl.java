package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emp.exception.RecordNotFoundException;
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
	public Employee empsaveOrUpdate(Employee emp) {
		Optional<Employee> empl=empRepository.findById(emp.getEmpid());
		if(empl.isPresent()) {
			Employee empdata=empl.get();
			emp.setEmpid(empdata.getEmpid());
			emp.setEmpName(empdata.getEmpName());
			emp.setSal(empdata.getSal());
			emp=empRepository.save(emp);
		}else {
			emp=empRepository.save(emp);
		}
		return emp;
	}

	@Override
	public Employee getempById(long empid) throws RecordNotFoundException {
		
		Optional<Employee> empById=empRepository.findById(empid);
		
		if(empById.isPresent()) {
			Employee empByIds=empById.get();
			return empByIds;
		}else {
			throw new RecordNotFoundException("Recor");
		}
		
		//return empByIds;
	}

}
