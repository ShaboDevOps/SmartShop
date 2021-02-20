package com.kayaTech.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kayaTech.Model.PurchaseStatistics;
import com.kayaTech.Model.RequiredProduct;
import com.kayaTech.Repostory.PurchaseStatisticsRepo;
import com.kayaTech.Repostory.RequiredProductRepo;

@Component
public class ServiceClass {
	
	@Autowired
	PurchaseStatisticsRepo purchaseStatisticsRepo;
	@Autowired
	RequiredProductRepo requiredProductRepo;
	
	public List<RequiredProduct> getRequiredProducts(){
		
		return requiredProductRepo.findAll();
		
	}

	public void savePurchases(PurchaseStatistics purchaseStatistics) {
		
		purchaseStatisticsRepo.saveAndFlush(purchaseStatistics);
	}

}
