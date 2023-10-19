package demoooo;

abstract public class Student 
{
	String name;
	
	abstract void print();
	void printName()
	{
		System.out.println(name);
	}
}

class StudentMain extends Student
{

	@Override
	void print() {
		System.out.println("Hello");
		
	}
	
}
