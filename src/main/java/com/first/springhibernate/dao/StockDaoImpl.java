package com.first.springhibernate.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.first.springhibernate.pojo.Stock;

public class StockDaoImpl extends HibernateDaoSupport implements StockDao{

	public void save(Stock stock) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(stock);
		
	}

	public void update(Stock stock) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(stock);
	}

	public void delete(Stock stock) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(stock);
	}

	public Stock findByStockCode(String stockCode) {
		// TODO Auto-generated method stub
	//	System.out.println("This is here ");
		//int stockInt=Integer.parseInt(stockCode);
		List list=getHibernateTemplate().find(
				"from Stock where stockCode =?",stockCode);
	//	System.out.println("YOo me back");
		return (Stock)list.get(0);
	}

}
