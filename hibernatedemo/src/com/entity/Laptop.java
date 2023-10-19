package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop 
{
	@Id
	private int laptopId;
	private String laptopName;
	
	public Laptop(int laptopId, String laptopName) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
	}
	
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	
	

}
