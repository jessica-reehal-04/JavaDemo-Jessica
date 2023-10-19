package demoooo;

abstract class Vehicle
{
	int mileage;
	
	String colour;
	
	abstract void showData();
}

class Bike extends Vehicle
{


	int tyre;
	
	Bike(int tyre,int mileage)
	{
		this.tyre=tyre;
		super.mileage=mileage;
		
	}
	@Override
	void showData() {
		
		System.out.println(mileage);
		
	}
	
}

class Car extends Vehicle
{

	int tyre;
	@Override
	void showData() {
		mileage=10;
		System.out.println(mileage);
		
	}
	
}
public class Automobile {
	public static void main(String[] args) {
		Vehicle b=new Bike(2,45);
		b.showData();
		
	}
	

}
