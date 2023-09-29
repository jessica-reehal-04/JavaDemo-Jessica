package com.first;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Optional;

import com.second.Exams;
import com.second.School;
import com.third.Gradings;
import com.third.Shuttle;
import com.third.Students;

public class Organizer implements SchoolDAO
{
	@Override
	public void showData(Optional<School> school) 
	{
		
      
//		print name of students
		school.flatMap(s->s.getExams()).flatMap(e->e.getStudents()).get().forEach(s->System.out.println(s.getStudentName()+" "+s.getGradings()+" "+s.getShuttle().map(sh->sh.getRouteName())));
//		
//		school.flatMap(e->e.getExams()).flatMap(s->s.getStudents()).get().forEach(s->System.out.println(s.getShuttle()));

	}

	
	
	public static void main(String[] args)
	{
		Shuttle shuttle=new Shuttle(1,"Ludhiana",20);
		
		ArrayList<Students> st=new ArrayList<>();
		Students student1=new Students(11,"Jessica",Gradings.GradeType.A,Optional.of(shuttle));
		Students student2=new Students(12,"Maneet",Gradings.GradeType.B,Optional.of(shuttle));
		Students student3=new Students(13,"Sahil",Gradings.GradeType.A,Optional.of(shuttle));
		Students student4=new Students(14,"Manan",Gradings.GradeType.B,Optional.of(shuttle));
		
		st.add(student1);
		st.add(student2);
		st.add(student3);
		st.add(student4);
		
		Exams ex=new Exams("Final Exam","Maths", IsoChronology.INSTANCE.date(1991, 8, 13),Optional.of(st));
		
		School school=new School("GNPS","Ludhiana",Optional.of(ex));
		
		Organizer o=new Organizer();
		o.showData(Optional.of(school));
		
	}

	

	
}
