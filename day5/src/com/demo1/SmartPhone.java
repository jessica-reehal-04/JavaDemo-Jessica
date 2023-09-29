package com.demo1;

import java.util.Optional;

public class SmartPhone 
{
	private int id;
	private String brandName;
	private String name;
	private Optional<DisplayFeatures> features;
	
	public SmartPhone(int id, String brandName, String name, Optional<DisplayFeatures> features) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.name = name;
		this.features = features;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<DisplayFeatures> getFeatures() {
		return features;
	}

	public void setFeatures(Optional<DisplayFeatures> features) {
		this.features = features;
	}
	
	

	

}
