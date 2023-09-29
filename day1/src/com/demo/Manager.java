package com.demo;

public class Manager extends Employee
{
	private int noOfEmployees;
	private double hRA;
	
	public Manager(int id, String name, String city, int noOfEmployees, double hRA) {
		super(id, name, city);
		this.noOfEmployees = noOfEmployees;
		this.hRA = hRA;
	}
	
	
	
	public int getNoOfEmployees() {
		return noOfEmployees;
	}



	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}



	public double gethRA() {
		return hRA;
	}



	public void sethRA(double hRA) {
		this.hRA = hRA;
	}



	public String toString()
	{
		return super.getId()+' '+super.getName()+' '+super.getCity()+' '+this.getNoOfEmployees()+' '+this.gethRA();
	}

}
