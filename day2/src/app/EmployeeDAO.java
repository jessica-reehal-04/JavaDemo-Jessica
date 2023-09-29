package app;

import java.io.FileNotFoundException;

public interface EmployeeDAO 
{
	public void addEmployee(Employee e) throws SomethingWentWrongException;
}
