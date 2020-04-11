package com.emp.service;

import java.util.List;

import com.emp.exception.RecordNotFoundException;
import com.emp.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllemployees();

	public Employee empsaveOrUpdate(Employee emp);

	public Employee getempById(long empid) throws RecordNotFoundException;

}
