/**
 * 
 */
package com.siva.spring.transcation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.siva.spring.transcation.dao.HealthInsuranceDao;
import com.siva.spring.transcation.model.EmployeeHealthInsurance;
import com.siva.spring.transcation.service.HealthInsuranceService;

/**
 * @author Siva
 *
 */
public class HealthInsuranceServiceImpl implements HealthInsuranceService {
	
	
	@Autowired
	HealthInsuranceDao healthInsuranceDao;

	@Override
	public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) {
		healthInsuranceDao.registerEmployeeHealthInsurance(employeeHealthInsurance);
	}

	@Override
	public void deleteEmployeeHealthInsuranceById(String empid) {
		healthInsuranceDao.deleteEmployeeHealthInsuranceById(empid);
	}
}
