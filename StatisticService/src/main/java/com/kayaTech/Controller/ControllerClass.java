package com.kayaTech.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kayaTech.Model.PurchaseStatistics;
import com.kayaTech.Model.RequiredProduct;
import com.kayaTech.Services.ServiceClass;

@RestController
public class ControllerClass {

	@Autowired
	private ServiceClass service;
	
	@GetMapping("/mostPurchased")
	public List<RequiredProduct> getMostPurchasedProducts(){
	
		return service.getRequiredProducts();
	}
	
	@PostMapping("/addPurchase")
	public void addPurchases(@RequestBody PurchaseStatistics purchaseStatistics) {
		
		service.savePurchases(purchaseStatistics);
	}
	
}
