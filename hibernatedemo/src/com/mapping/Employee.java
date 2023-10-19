package com.mapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.mapping.Laptop;


@Entity
public class Employee 
{
	@Id
	private int empId;
	private String empName;
	
	@OneToOne(cascade=CascadeType.ALL)
    private Laptop laptop;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn
	private List<Address> address;

	public Employee(int empId, String empName, Laptop laptop, List<Address> address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.laptop = laptop;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	
	
	

}
