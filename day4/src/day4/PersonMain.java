package day4;

import java.util.List;

public class PersonMain 
{
	public static void main(String[] args) 
	{
		List<Person> lst=Person.createRoster();
		
//		lst.stream().map((mp)->mp.getName()).forEach(System.out::println);
		lst.stream().filter((p)->p.getGender()==Person.Sex.MALE).map((mp)->mp.getName()).forEach(System.out::println);
		
		System.out.println(lst.stream().filter((p)->p.getGender()==Person.Sex.MALE).mapToInt((p)->p.getAge()).average().getAsDouble());
	}
}
