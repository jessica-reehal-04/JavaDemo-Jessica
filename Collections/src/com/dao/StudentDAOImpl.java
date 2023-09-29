package com.dao;

import com.model.Student;

public class StudentDAOImpl implements StudentDAO
{

	@Override
	public void addStudent(Student s) 
	{
		al.add(s);

		
	}

	@Override
	public void updateStudent(int id, int roll)
	{
		Student s=search(id);
		if(s!=null)
		{
			s.setStudentRoll(roll);
			System.out.println("Student updated...");
		}
		else
		    System.out.println("Student doesn't exist");
		
	}

	@Override
	public void updateStudent(int id, String name) 
	{
		Student s=search(id);
		if(s!=null)
		{
			s.setStudentName(name);
			System.out.println("Student updated...");
		}
		else
		    System.out.println("Student doesn't exist");
		
	}

	@Override
	public void updateStudent(int id, double marks) 
	{
		Student s=search(id);
		if(s!=null)
		{
			s.setMarks(marks);
			System.out.println("Student updated...");
		}
		else
		    System.out.println("Student doesn't exist");
		
		
	}

	@Override
	public void delete(int id)
	{
		if(search(id)==null)
		{
			System.out.println("Student not found");
			return;
		}
//		for(int i=0;i<al.size();i++)
//		{
//			if(al.get(i).getStudentId()==id)
//				al.remove(i);
//		}
		int index=-1;
		for(Student s:al)
		{
			if(s.getStudentId()==id)
			{
//				index=al.indexOf(s);
				break;
			}
		}
		al.remove(index);
		System.out.println("Student deleted...");
	}

	@Override
	public Student search(int id) 
	{
		for(Student s:al)
		{
			if(s.getStudentId()==id)
				return s;
		}
		return null;
	}

	@Override
	public void getStudents() 
	{
		System.out.println(al);
	}

}
