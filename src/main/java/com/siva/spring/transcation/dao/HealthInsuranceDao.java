/**
 * 
 */
package com.siva.spring.transcation.dao;

import com.siva.spring.transcation.model.EmployeeHealthInsurance;

/**
 * @author Siva
 *
 */
public interface HealthInsuranceDao {
	
	void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

	void deleteEmployeeHealthInsuranceById(String empid);

}
