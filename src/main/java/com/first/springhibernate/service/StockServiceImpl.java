package com.first.springhibernate.service;

import com.first.springhibernate.dao.StockDao;
import com.first.springhibernate.pojo.Stock;

public class StockServiceImpl implements StockService{
	
	StockDao stockDao;
	
	public void setStockDao(StockDao stockDao){
		this.stockDao=stockDao;
	}

	public void save(Stock stock) {
		// TODO Auto-generated method stub
		stockDao.save(stock);
		
	}

	public void update(Stock stock) {
		// TODO Auto-generated method stub
		stockDao.update(stock);
		
	}

	public void delete(Stock stock) {
		// TODO Auto-generated method stub
		stockDao.delete(stock);
		
	}

	public Stock findByStockCode(String StockCode) {
		// TODO Auto-generated method stub
		return stockDao.findByStockCode(StockCode);
		//return null;
	}

}
