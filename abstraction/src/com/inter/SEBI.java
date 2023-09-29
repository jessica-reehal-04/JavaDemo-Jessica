package com.inter;

import com.models.Stocks;

public interface SEBI 
{
	void addStocks(Stocks s);
	void sellStocks(int stockId);
}
