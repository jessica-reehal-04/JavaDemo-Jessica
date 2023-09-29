package com.demo1;

public class Camera 
{
	private String lens;
	private int pixels;
	
	public Camera(String lens, int pixels) {
		super();
		this.lens = lens;
		this.pixels = pixels;
	}
	public String getLens() {
		return lens;
	}
	public void setLens(String lens) {
		this.lens = lens;
	}
	public int getPixels() {
		return pixels;
	}
	public void setPixels(int pixels) {
		this.pixels = pixels;
	}
	
	

}
