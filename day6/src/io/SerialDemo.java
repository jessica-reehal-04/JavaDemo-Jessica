package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) throws IOException
	{
		Student student=new Student(101,"Jessica","jess@gmail.com","Ludhiana");
		
		FileOutputStream fos=new FileOutputStream("data.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(student);
	}

}
