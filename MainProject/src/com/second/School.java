package com.second;

import java.util.Optional;

public class School 
{
	private String schoolName;
	private String address;
	private Optional<Exams> exams;
	
	public School(String schoolName, String address, Optional<Exams> exams) {
		super();
		this.schoolName = schoolName;
		this.address = address;
		this.exams = exams;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Optional<Exams> getExams() {
		return exams;
	}

	public void setExams(Optional<Exams> exams) {
		this.exams = exams;
	}
	
	

}
