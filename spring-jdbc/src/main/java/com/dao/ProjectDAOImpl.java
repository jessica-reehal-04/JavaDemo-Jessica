package com.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Project;

@Repository
public class ProjectDAOImpl extends JdbcDaoSupport implements ProjectDAO
{
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void init()
	{
		setDataSource(dataSource);
	}
	@Override
	public void addProject(Project project) 
	{
		String sql="insert into project(emp_id,project_id,project_name,location) values(?,?,?,?)";
		getJdbcTemplate().update(sql,new Object[] {project.getEmpId(),project.getProjectId(),project.getProjectName(),project.getLocation()});
		
	}

}
