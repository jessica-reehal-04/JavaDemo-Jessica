package com.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppAspect 
{
	@Before("execution (* com.service.EmployeeInsService.assignEmployeeToInsurance(..))")
	public void beforeInsuranceCalled()
	{
		System.out.println("Before insurance called");
	}
	
	@Before("execution (* com.service.EmployeeInsService.assignEmployeeToProject(..))")
	public void beforeProjectCalled()
	{
		System.out.println("Before project called");
	}
	
	@After("execution (* com.service.EmployeeInsService.assignEmployeeToProject(..))")
	public void beforeAfterProjectCalled()
	{
		System.out.println("After project called");
	}

}
