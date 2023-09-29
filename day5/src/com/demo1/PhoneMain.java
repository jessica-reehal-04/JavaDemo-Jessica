package com.demo1;

import java.util.Optional;

public class PhoneMain 
{
	public static void main(String[] args)
	{
		MobileServiceStation mss=new MobileServiceStation();
		
//		SmartPhone s=new SmartPhone(1,"Apple","IPhone",new DisplayFeatures(13,new Screenresol(12,16)));
		
//		Screenresol res=new Screenresol(12,13);
//		DisplayFeatures displayFeatures=new DisplayFeatures(15, Optional.of(res));
//		SmartPhone ph=new SmartPhone(1,"Apple","IPhone",Optional.of(displayFeatures));
//		System.out.println(mss.getWidth(Optional.of(ph)));
//		
//		DisplayFeatures displayFeatures2=new DisplayFeatures(15, Optional.empty());
//		SmartPhone ph2=new SmartPhone(1,"Apple","IPhone",Optional.of(displayFeatures2));
//		System.out.println(mss.getWidth(Optional.of(ph2)));
		
		
		Screenresol sc=new Screenresol(11,12);
		
		Camera c=new Camera("Optical",120);
		
		DisplayFeatures displayFeatures=new DisplayFeatures(20,Optional.of(sc),Optional.of(c));
		SmartPhone ph=new SmartPhone(1,"Apple","IPhone",Optional.of(displayFeatures));
		
		System.out.println(mss.getLens(Optional.of(ph)));
		System.out.println(mss.getPixels(Optional.of(ph)));
	}

}
