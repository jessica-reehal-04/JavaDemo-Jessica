package com.example.springcore;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("project.country")
public class AppConfiguration 
{
	private String pname;
	private String location;
	private String noOfEmp;
	private String budget;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(String noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	@Bean
	@Profile("india")
	public String indiaProject()
	{
		System.out.println(pname);
		System.out.println(location);
		System.out.println(noOfEmp);
		System.out.println(budget);
		return "India Project";
	}
	
	@Bean
	@Profile("usa")
	public String usaProject()
	{
		System.out.println(pname);
		System.out.println(location);
		System.out.println(noOfEmp);
		System.out.println(budget);
		return "USA Project";
	}
}
