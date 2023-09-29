package app;

import java.io.FileNotFoundException;

public class EmployeeMain
{
	public static void main(String[] args) 
	{
		EmployeeDAO emp=new EmployeeDAOImpl();
		try
		{
		emp.addEmployee(new Employee(1,"Jess"));
		}
		catch(SomethingWentWrongException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
