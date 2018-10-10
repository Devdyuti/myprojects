package org.core.tutorial.testcases;

public class Stock {

	private String stockId;
	private String name;
	private double quantity;
	
	public Stock(String stockId, String name, int quantity) {
		super();
		this.stockId = stockId;
		this.name = name;
		this.quantity = quantity;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}
