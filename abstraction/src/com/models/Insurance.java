package com.models;

public class Insurance 
{
	private String insuranceType;
	private double premium;
	
	public Insurance() 
	{
		super();
	}

	public Insurance(String insuranceType, double premium) 
	{
		super();
		this.insuranceType = insuranceType;
		this.premium = premium;
	}

	public String getInsuranceType() 
	{
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) 
	{
		this.insuranceType = insuranceType;
	}

	public double getPremium() 
	{
		return premium;
	}

	public void setPremium(double premium) 
	{
		this.premium = premium;
	}

	@Override
	public String toString() 
	{
		return "Insurance [insuranceType=" + insuranceType + ", premium=" + premium + "]";
	}
	
	
	
	

}
