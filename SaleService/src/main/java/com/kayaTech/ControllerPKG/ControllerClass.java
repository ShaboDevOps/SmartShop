package com.kayaTech.ControllerPKG;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kayaTech.Model.Sales;
import com.kayaTech.Service.Service;

@RestController
public class ControllerClass {
	
	@Autowired
	private Service service;

	@PostMapping("/addSales")
	public List<Sales> addSales(@RequestBody List<Sales> sales) {
		
		return service.saveSales(sales);
	}
	
	@GetMapping("/getSales")
	public List<Sales> getAllSales(){
		
		return service.getSales();
	}
}