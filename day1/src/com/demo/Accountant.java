package com.demo;

public class Accountant extends Employee
{
	private String salaryProcessDay;
	private boolean approvalTaken;
	
	public Accountant(int id, String name, String city, String salaryProcessDay, boolean approvalTaken) {
		super(id, name, city);
		this.salaryProcessDay = salaryProcessDay;
		this.approvalTaken = approvalTaken;
	}

	public String getSalaryProcessDay() {
		return salaryProcessDay;
	}

	public void setSalaryProcessDay(String salaryProcessDay) {
		this.salaryProcessDay = salaryProcessDay;
	}

	public boolean isApprovalTaken() {
		return approvalTaken;
	}

	public void setApprovalTaken(boolean approvalTaken) {
		this.approvalTaken = approvalTaken;
	}
	
	public String toString()
	{
		return super.getId()+' '+super.getName()+' '+super.getCity()+' '+this.getSalaryProcessDay()+' '+this.isApprovalTaken();
	}

}
