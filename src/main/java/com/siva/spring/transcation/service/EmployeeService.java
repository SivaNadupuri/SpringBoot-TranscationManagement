package com.siva.spring.transcation.service;

import com.siva.spring.transcation.model.Employee;

public interface EmployeeService {
	
	void insertEmployee(Employee emp);

	void deleteEmployeeById(String empid);

}
