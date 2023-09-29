package com.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import com.model.Student;

public interface StudentDAO 
{
//	public ArrayList<Student> al=new ArrayList<>();
	
	public TreeSet<Student> al=new TreeSet<>();
	
	public void addStudent(Student s);
	public void updateStudent(int id,int roll);
	public void updateStudent(int id,String name);
	public void updateStudent(int id,double marks);
	public void delete(int id);
	public Student search(int id);
	
	public void getStudents();

}
