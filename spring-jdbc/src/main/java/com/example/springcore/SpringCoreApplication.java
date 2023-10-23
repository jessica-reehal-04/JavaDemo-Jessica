package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.model.Employee;
import com.model.Insurance;
import com.model.InsuranceType;
import com.model.Project;
import com.service.EmployeeInsService;


@SpringBootApplication
@ComponentScan("com")
public class SpringCoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringCoreApplication.class, args);
		
		EmployeeInsService service=(EmployeeInsService) ctx.getBean("empins");
		
		Employee emp=new Employee(5,"Jess","Ldh");
		Insurance ins=new Insurance(5,InsuranceType.HEALTH_INSURANCE,560000);
		Project proj=new Project(5,213,"Vehicle Rental System","Bangalore");
		service.assignEmployeeToInsurance(emp, ins);
		service.assignEmployeeToProject(emp, proj);
		
		System.out.println("Added successfully...");
	}

}
