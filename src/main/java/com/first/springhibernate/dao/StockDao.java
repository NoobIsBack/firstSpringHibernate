package com.first.springhibernate.dao;

import com.first.springhibernate.pojo.Stock;

public interface StockDao {
	
	public void save(Stock stock);
	public void  update(Stock stock);
	public void delete(Stock stock); 
	public Stock findByStockCode(String StockCode);

}
