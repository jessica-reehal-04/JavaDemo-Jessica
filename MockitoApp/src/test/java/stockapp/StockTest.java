package stockapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class StockTest 
{
	Portfolio portfolio;
	
	@Mock
	StockService service;
	
	@BeforeEach
	public void init()
	{
		portfolio=new Portfolio();
		service=Mockito.mock(StockService.class);
		portfolio.setStockService(service);
	}
	@Test
	public void testMarketValue()
	{
		List<Stock> stocks=new ArrayList<>();
		Stock gstock=new Stock("101","Google",10);
		Stock mstock=new Stock("102","Microsoft",1000);
		stocks.add(gstock);
		stocks.add(mstock);
		
		portfolio.setStocks(stocks);
		
		Mockito.when(service.getPrice(gstock)).thenReturn(50.0);
		Mockito.when(service.getPrice(mstock)).thenReturn(5000.0);
		
		double expected=5000500.00;
		assertEquals(expected,portfolio.getMarketValue());
		
		
	}

}
