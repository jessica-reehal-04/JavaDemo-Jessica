package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeMain 
{
	public static List<Employee> createEmployees()
	{
		List<Employee> lst=new ArrayList<>();
		
		lst.add(new Employee("Jessica","Ludhiana",22));
		lst.add(new Employee("Maneet","Mumbai",52));
		lst.add(new Employee("Itashi","Pathankot",21));
		
		return lst;
	}
	
	public static Optional<Employee> searchEmployees(List<Employee> lst,String name)
	{
		for(Employee e:lst)
		{
			if(e.getName().equalsIgnoreCase(name))
			{
				return Optional.of(e);
			}
		}
		return Optional.empty();
	}
	
	public static void main(String []args)
	{
		List<Employee> lst=EmployeeMain.createEmployees();
		
		Optional<Employee> e=EmployeeMain.searchEmployees(lst, "Jhessica");
		
		
		if(e.isPresent())
		{
			Employee emp=e.get();
			System.out.println("Employee "+emp.getName());
		}
		else
			System.out.println("Employee Not Found");
		
		
	}

}
