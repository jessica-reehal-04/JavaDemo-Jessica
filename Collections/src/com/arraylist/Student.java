package com.arraylist;

public class Student 
{
	private int studentId;
	private int studentRoll;
	private String studentName;
	private double marks;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int studentId, int studentRoll, String studentName, double marks) {
		super();
		this.studentId = studentId;
		this.studentRoll = studentRoll;
		this.studentName = studentName;
		this.marks = marks;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public int getStudentRoll() {
		return studentRoll;
	}


	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentRoll=" + studentRoll + ", studentName=" + studentName
				+ ", marks=" + marks + "]";
	}
	
	
	
	

}
