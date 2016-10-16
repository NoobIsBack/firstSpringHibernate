package com.first.springhibernate.SockNew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.first.springhibernate.pojo.Stock;
import com.first.springhibernate.service.StockService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("resources/config/BeanLocations.xml");
        StockService stockService=(StockService)context.getBean("stockBo");
        
        
        //insertion
        
       /* Stock st=new Stock();
        st.setStockCode("766");
        st.setStockName("maynk");
        stockService.save(st);*/
        
        Stock stockGet=stockService.findByStockCode("766");
       // System.out.println("after the stockGet");
        System.out.println(stockGet.getStock_Id());
    }
}
