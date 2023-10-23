package com.service;

import com.model.Employee;
import com.model.Insurance;
import com.model.Project;

public interface EmployeeInsService 
{
	public void assignEmployeeToInsurance(Employee employee,Insurance insurance);
	public void assignEmployeeToProject(Employee employee,Project project);
}
