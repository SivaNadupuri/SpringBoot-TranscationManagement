package com.siva.spring.transcation.service.impl;

import org.springframework.stereotype.Service;

import com.siva.spring.transcation.dao.EmployeeDao;
import com.siva.spring.transcation.model.Employee;
import com.siva.spring.transcation.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao empDao;

	@Override
	public void insertEmployee(Employee emp) {

		empDao.insertEmployee(emp);
	}

	@Override
	public void deleteEmployeeById(String empid) {
		empDao.deleteEmployeeById(empid);

	}

}
