package day5;

public class Employee
{
	private String name;
	private String city;
	private int age;
	
	
	public Employee(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", age=" + age + "]";
	}


	
	
	

}
