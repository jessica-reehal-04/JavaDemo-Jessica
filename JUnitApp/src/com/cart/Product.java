package com.cart;

public class Product {
	private String title;
	private double price;
	
	public Product(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [title=" + title + ", price=" + price + "]";
	}
	
	
}
