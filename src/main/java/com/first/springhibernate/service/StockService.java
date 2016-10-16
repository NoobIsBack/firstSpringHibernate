package com.first.springhibernate.service;

import com.first.springhibernate.pojo.Stock;

public interface StockService {
	
	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String StockCode);
	

}
