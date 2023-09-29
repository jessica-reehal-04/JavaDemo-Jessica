package day4;

public class DemoClass implements DefaultInterface 
{
	@Override
	public void addUser() 
	{
		System.out.println("Add User");
	}
	
	public void show()
	{
		System.out.println("Show child");
	}
	
	public void showUser()
	{
		System.out.println("Static child");
	}
	public static void main(String[] args)
	{
		DefaultInterface d=new DemoClass();
		d.show();
		d.addUser();
		
	
	}

}
