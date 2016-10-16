package com.first.springhibernate.pojo;

public class Stock {
	
	private Long stock_Id;
	private String stockCode;
	private String stockName;

	
	
	public Long getStock_Id() {
		return stock_Id;
	}
	public void setStock_Id(Long stock_Id) {
		this.stock_Id = stock_Id;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

}
