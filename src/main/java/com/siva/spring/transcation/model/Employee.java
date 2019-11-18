package com.siva.spring.transcation.model;

public class Employee {
	private String empld;
	private String empName;
	/**
	 * @return the empld
	 */
	public String getEmpld() {
		return empld;
	}
	/**
	 * @param empld the empld to set
	 */
	public void setEmpld(String empld) {
		this.empld = empld;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empld=" + empld + ", empName=" + empName + "]";
	}
		

}
