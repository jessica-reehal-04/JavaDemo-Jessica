package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams 
{
	public int calculateSum(ArrayList<Integer> al)
	{
//		int sum=0;
//		for(Integer num:al)
//		{
//			if(num.intValue()>10)
//			{
//				sum+=num.intValue();
//			}
//		}
//		
//		al.forEach((num)->{
//			num+=1;
//		});
//		System.out.println(sum);
		
		return al.stream().filter(num->num>10).mapToInt(num->num).sum();
	}

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(2);
		al.add(12);
		al.add(20);
		al.add(3);
		al.add(32);
		al.add(1);
		
		ArrayList<String> users=new ArrayList<>();
		
		users.add("Aman");
		users.add("Jessica");
		users.add("Arvind");
		users.add("Rahul");
		JavaStreams js=new JavaStreams();
//		System.out.println(js.calculateSum(al));
		
		users.stream().filter((u)->u.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
	
		
		users.stream().sorted().forEach(System.out::println);
	
	    List<String> newList=users.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
	    System.out.println(newList);
	    
	    System.out.println(users.stream().count());
	}

}
