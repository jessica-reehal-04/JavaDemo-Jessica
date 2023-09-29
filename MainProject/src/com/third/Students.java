package com.third;

import java.util.Optional;

import com.third.Gradings.GradeType;

public class Students 
{
	private int studentId;
	private String studentName;
	private GradeType gradings;
	private Optional<Shuttle> shuttle;
	
	public Students(int studentId, String studentName, GradeType gradings, Optional<Shuttle> shuttle) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.gradings = gradings;
		this.shuttle = shuttle;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public GradeType getGradings() {
		return gradings;
	}
	public void setGradings(GradeType gradings) {
		this.gradings = gradings;
	}
	public Optional<Shuttle> getShuttle() {
		return shuttle;
	}
	public void setShuttle(Optional<Shuttle> shuttle) {
		this.shuttle = shuttle;
	}
	
	

}
