package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deserialdemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("data.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student student=(Student)ois.readObject();
		
		System.out.println(student);
	}

}
