
public class Staticdemo {
	 static int a=6;
	
	public static void main(String[] args) {
		Staticdemo s1=new Staticdemo();
		
		
		s1.a=8;
		System.out.println(s1.a);
        Staticdemo s2=new Staticdemo();
		
		System.out.println(s2.a);
	}

}
