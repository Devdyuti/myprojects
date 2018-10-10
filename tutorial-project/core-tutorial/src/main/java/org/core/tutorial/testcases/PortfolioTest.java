package org.core.tutorial.testcases;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class PortfolioTest {
	Portfolio portfolio;
	StockService stockService;
	public static void main(String[] args) {
		
	}
	public void setup() {
		portfolio=new Portfolio();
		
		// creating a mock object of stock service
		stockService=mock(StockService.class);
		
		// set the stock service to the portfolio
		portfolio.setStockService(stockService);		
	}
	public boolean testMarketValue() {
		List<Stock> stocks = new ArrayList<Stock>();
		
		Stock googleStock=new Stock("1", "Google", 10);
		Stock sopraStock=new Stock("2", "Sopra", 20);
		Stock steriaStock=new Stock("3", "Steria", 30);
				
		stocks.add(googleStock);
		stocks.add(sopraStock);
		stocks.add(steriaStock);
		
		portfolio.setStocks(stocks);
		
		when(stockService.getPrice(googleStock)).thenReturn(50.00);
		when(stockService.getPrice(sopraStock)).thenReturn(100.00);
		when(stockService.getPrice(steriaStock)).thenReturn(150.00);
		
		double marketValue=portfolio.getMarketValue();
		return marketValue==100500.0;
	}
}
