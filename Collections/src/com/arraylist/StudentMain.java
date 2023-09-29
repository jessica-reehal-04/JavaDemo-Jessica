package com.arraylist;

import java.util.ArrayList;

public class StudentMain 
{
    private static ArrayList<Student> al;
	static
	{
		al=new ArrayList<>();
		al.add(new Student(1,11,"Jessica",88));
		al.add(new Student(2,12,"Itashi",95));
		al.add(new Student(3,13,"Aman",87));
		al.add(new Student(4,14,"Riya",68));
		al.add(new Student(5,15,"Priya",98));
	}
	
	public Student searchStudent(String name)
	{
		for(Student s:al)
		{
			if(s.getStudentName()==name)
				return s;
		}
		return null;
	}
	
	public double addMarks()
	{
		return al.stream().mapToDouble(mp->mp.getMarks()).sum();
	}
	public static void main(String[] args)
	{
		StudentMain st=new StudentMain();
		
		Student stud=st.searchStudent("Jessica");
		
		if(stud!=null)
		{
			System.out.println(stud);
		}
		else
			System.out.println("Student not found");
		
		System.out.println(st.addMarks());
	}

}
