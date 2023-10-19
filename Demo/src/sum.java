
public class sum 
{
	void add(int x,int y)
	{
		System.out.println(x+y);
	}
	void add(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	

	public static void main(String[] args) 
	{
		sum s=new sum();
		
		s.add(3, 4,6);
	}

}
