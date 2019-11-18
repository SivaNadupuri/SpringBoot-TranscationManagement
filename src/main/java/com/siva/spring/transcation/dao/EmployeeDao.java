package com.siva.spring.transcation.dao;

import com.siva.spring.transcation.model.Employee;

public interface EmployeeDao {
	void insertEmployee(Employee emp);
	void deleteEmployeeById(String empId);

}
