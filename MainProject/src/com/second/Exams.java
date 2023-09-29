package com.second;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

import com.third.Students;

public class Exams 
{
	private String examName;
	private String subjects;
	private LocalDate date;
	
	private Optional<ArrayList<Students>> students;

	public Exams(String examName, String subjects, LocalDate date, Optional<ArrayList<Students>> students) {
		super();
		this.examName = examName;
		this.subjects = subjects;
		this.date = date;
		this.students = students;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Optional<ArrayList<Students>> getStudents() {
		return students;
	}

	public void setStudents(Optional<ArrayList<Students>> students) {
		this.students = students;
	}
	
	

}
