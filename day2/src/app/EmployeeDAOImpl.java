package app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EmployeeDAOImpl implements EmployeeDAO
{

	@Override
	public void addEmployee(Employee e) throws SomethingWentWrongException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("H:\\data.txt");
			
		}
		catch(FileNotFoundException ex)
		{
			throw new SomethingWentWrongException("Oops! Something's wrong",ex);
		}
	}
	

}
