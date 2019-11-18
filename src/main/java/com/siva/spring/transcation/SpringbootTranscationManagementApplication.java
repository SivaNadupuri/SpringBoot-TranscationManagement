package com.siva.spring.transcation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.siva.spring.transcation.model.Employee;
import com.siva.spring.transcation.model.EmployeeHealthInsurance;
import com.siva.spring.transcation.service.OrganizationService;

@SpringBootApplication
public class SpringbootTranscationManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootTranscationManagementApplication.class, args);
		OrganizationService organizationService = context.getBean(OrganizationService.class);

		Employee emp = new Employee();
		emp.setEmpld("emp1");
		emp.setEmpName("emp1");

		EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
		employeeHealthInsurance.setEmpId("emp1");
		employeeHealthInsurance.setHealthInsuranceSchemeName("premium");
		employeeHealthInsurance.setCoverageAmount(20000);

		organizationService.joinOrganization(emp, employeeHealthInsurance);
	}

}
