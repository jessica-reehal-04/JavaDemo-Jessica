package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDAO;
import com.dao.InsuranceDAO;
import com.dao.ProjectDAO;
import com.model.Employee;
import com.model.Insurance;
import com.model.Project;

@Service("empins")
public class EmployeeInsServiceImpl implements EmployeeInsService
{
	@Autowired
	private EmployeeDAO empDao;
	
	@Autowired
	private InsuranceDAO insDao;
	
	@Autowired
	private ProjectDAO projDao;

	@Override
	@Transactional
	public void assignEmployeeToInsurance(Employee employee, Insurance insurance)
	{
		empDao.addEmployee(employee);
//		if(employee.getEmpId()==1163)
//		{
//			throw new RuntimeException("something went wrong...");
//		}
		insDao.addInsurance(insurance);
		
	}
	
	public void assignEmployeeToProject(Employee employee, Project project)
	{
		

		projDao.addProject(project);
	}

}
