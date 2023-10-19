package com.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the car database table.
 * 
 */
@Entity
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int regNo;

	private String carName;

	private String carType;

	private String color;

	private double mileage;

	public Car() {
	}
	
	

	public Car(int regNo, String carName, String carType, String color, double mileage) {
		super();
		this.regNo = regNo;
		this.carName = carName;
		this.carType = carType;
		this.color = color;
		this.mileage = mileage;
	}



	public int getRegNo() {
		return this.regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getCarName() {
		return this.carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarType() {
		return this.carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMileage() {
		return this.mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

}