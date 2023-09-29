package com.models;

public class Stocks 
{
	private int stockId;
	private String stockName;
	private int qty;
	private double price;
	
	
	public Stocks() 
	{
		super();
	}


	public Stocks(int stockId, String stockName, int qty, double price)
	{
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.qty = qty;
		this.price = price;
	}


	public int getStockId() {
		return stockId;
	}


	public void setStockId(int stockId) {
		this.stockId = stockId;
	}


	public String getStockName() {
		return stockName;
	}


	public void setStockName(String stockName) {
		this.stockName = stockName;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Stocks [stockId=" + stockId + ", stockName=" + stockName + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	
	
}
