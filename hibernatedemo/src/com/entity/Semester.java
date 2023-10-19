package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Semester 
{
	@Id
	private int semId;
	private int duration;
	private int studNumber;
	
	
	public Semester(int semId, int duration, int studNumber) {
		super();
		this.semId = semId;
		this.duration = duration;
		this.studNumber = studNumber;
	}
	public int getSemId() {
		return semId;
	}
	public void setSemId(int semId) {
		this.semId = semId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getStudNumber() {
		return studNumber;
	}
	public void setStudNumber(int studNumber) {
		this.studNumber = studNumber;
	}
	
	
	

}
