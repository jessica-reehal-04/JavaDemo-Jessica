package com.demo1;

import java.util.Optional;

public class MobileServiceStation 
{
//	public int getScreenWidth(SmartPhone phone)
//	{
//		if(phone!=null)
//		{
//			DisplayFeatures displayFeatures=phone.getFeatures();
//			if(displayFeatures!=null)
//			{
//				Screenresol c=displayFeatures.getResol();
//				if(c!=null)
//				{
//					return c.getWidth();
//				}
//			}
//		}
//		return 0;
//	}
	
	public int getWidth(Optional<SmartPhone> phone)
	{
		return phone.flatMap(SmartPhone::getFeatures).flatMap(DisplayFeatures::getResol).map(Screenresol::getWidth).orElse(0);
	}
	
	public String getLens(Optional<SmartPhone> phone)
	{
		return phone.flatMap(SmartPhone::getFeatures).flatMap(DisplayFeatures::getCamera).map(Camera::getLens).orElse("No lens");
	}
	public int getPixels(Optional<SmartPhone> phone)
	{
		return phone.flatMap(SmartPhone::getFeatures).flatMap(DisplayFeatures::getCamera).map(Camera::getPixels).orElse(0);
	}

}
