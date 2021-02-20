package com.kayaTech.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kayaTech.Model.Sales;
import com.kayaTech.Repostory.RepoINF;

@Component
public class Service {

	@Autowired
    private RepoINF repo;
	public List<Sales> saveSales(List<Sales> sales) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    
	    for(Sales sale : sales) {
	    sale.setDate(formatter.format(date));
	    sale.setProfit(
	    		sale.getTotalAmount()*0.35
	    		);
	    sale.setDay(null);
	    sale.setDept(null);
	    sale.setReservedAmount(
	    		sale.getProfit()
	    		);

	    }
		return repo.saveAll(sales);
	}
	public List<Sales> getSales() {
		
		return repo.findAll();
	}

}
