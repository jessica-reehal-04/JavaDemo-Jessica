package demoooo;

abstract class Fruit
{
	abstract void fruitname();
	void print()
	{
		System.out.println("Print");
	}
	
	
}

class Mango extends Fruit
{

	@Override
	void fruitname() {
		System.out.println("Mango");
		
	}
	

}

class Apple extends Fruit
{

	@Override
	void fruitname() {
		// TODO Auto-generated method stub
		System.out.println("Apple");
	}
	
}



public class Main {

	

}
