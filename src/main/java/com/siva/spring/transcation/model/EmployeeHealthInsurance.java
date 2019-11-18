/**
 * 
 */
package com.siva.spring.transcation.model;

/**
 * @author Siva
 *
 */
public class EmployeeHealthInsurance {
	
	private String empId;
	private String healthInsuranceSchemeName;
	private int coverageAmount;
	/**
	 * @return the coverageAmount
	 */
	public int getCoverageAmount() {
		return coverageAmount;
	}
	/**
	 * @param coverageAmount the coverageAmount to set
	 */
	public void setCoverageAmount(int coverageAmount) {
		this.coverageAmount = coverageAmount;
	}
	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	/**
	 * @return the healthInsuranceSchemeName
	 */
	public String getHealthInsuranceSchemeName() {
		return healthInsuranceSchemeName;
	}
	/**
	 * @param healthInsuranceSchemeName the healthInsuranceSchemeName to set
	 */
	public void setHealthInsuranceSchemeName(String healthInsuranceSchemeName) {
		this.healthInsuranceSchemeName = healthInsuranceSchemeName;
	}
	

}
