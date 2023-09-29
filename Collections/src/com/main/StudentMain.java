package com.main;

import com.dao.StudentDAO;
import com.dao.StudentDAOImpl;
import com.model.Student;

public class StudentMain
{
	public static void main(String[] args)
	{
		StudentDAO st=new StudentDAOImpl();
		
		st.addStudent(new Student(1,11,"Maneet",89));
		st.addStudent(new Student(2,22,"Reet",78));
		st.addStudent(new Student(6,33,"Reet",78));
		st.addStudent(new Student(4,44,"Nina",77));
		st.addStudent(new Student(4,44,"Nina",77));
		st.getStudents();
//		st.delete(1);
//		st.getStudents();
		
	}

}
