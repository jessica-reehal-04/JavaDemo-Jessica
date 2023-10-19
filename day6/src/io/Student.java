package io;

import java.io.Serializable;

public class Student implements Serializable
{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int studentId;
	private String studentName;
	private String email;
	private transient String city;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int studentId, String studentName, String email,String city) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		this.city=city;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email + ", city="
				+ city + "]";
	}


	
	
	
	

}
