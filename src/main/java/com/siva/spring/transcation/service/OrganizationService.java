package com.siva.spring.transcation.service;

import com.siva.spring.transcation.model.Employee;
import com.siva.spring.transcation.model.EmployeeHealthInsurance;

public interface OrganizationService {
	
	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}
