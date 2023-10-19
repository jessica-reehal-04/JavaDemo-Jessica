class parent
{
	int age=6;
	void print()
	{
		System.out.println("Hi");
	}
	
}
public class child extends parent{
	
	int age=7;
	
	void printage()
	{
		System.out.println(super.age);
		System.out.println(this.age);
		super.print();
	}
	
	public static void main(String[] args) {
		child c=new child();
		c.printage();
	}
}
