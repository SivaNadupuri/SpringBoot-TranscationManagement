package com.siva.spring.transcation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.siva.spring.transcation.model.Employee;
import com.siva.spring.transcation.model.EmployeeHealthInsurance;
import com.siva.spring.transcation.service.EmployeeService;
import com.siva.spring.transcation.service.HealthInsuranceService;
import com.siva.spring.transcation.service.OrganizationService;

@Service
public class OrganzationServiceImpl implements OrganizationService {

	@Autowired
	EmployeeService employeeService;

	@Autowired
	HealthInsuranceService healthInsuranceService;

	@Override
	@Transactional
	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
		employeeService.insertEmployee(employee);
		if (employee.getEmpld().equals("emp1")) {
			throw new RuntimeException("thowing exception to test transaction rollback");
		}
		healthInsuranceService.registerEmployeeHealthInsurance(employeeHealthInsurance);
	}

	@Override
	@Transactional
	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
		employeeService.deleteEmployeeById(employee.getEmpld());
		healthInsuranceService.deleteEmployeeHealthInsuranceById(employeeHealthInsurance.getEmpId());
	}
}