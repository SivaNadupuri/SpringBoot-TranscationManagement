/**
 * 
 */
package com.siva.spring.transcation.service;

import com.siva.spring.transcation.model.EmployeeHealthInsurance;

/**
 * @author Siva
 *
 */
public interface HealthInsuranceService {
	void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

	void deleteEmployeeHealthInsuranceById(String empid);

}
