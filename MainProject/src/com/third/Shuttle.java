package com.third;

public class Shuttle 
{
	private int shuttleId;
	private String routeName;
	private int capacity;
	
	public Shuttle(int shuttleId, String routeName, int capacity) 
	{
		super();
		this.shuttleId = shuttleId;
		this.routeName = routeName;
		this.capacity = capacity;
	}

	public int getShuttleId() {
		return shuttleId;
	}

	public void setShuttleId(int shuttleId) {
		this.shuttleId = shuttleId;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
	
}
