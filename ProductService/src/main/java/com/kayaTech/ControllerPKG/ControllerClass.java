package com.kayaTech.ControllerPKG;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.kayaTech.Model.Product;
import com.kayaTech.ServicePKG.Service;

@RestController
public class ControllerClass {
	
	@Autowired
	private Service service;
	
	@PostMapping("/register")
	public List<Product> register(@RequestBody List<Product> product) {
		
		return service.addProducts(product);
	}
	
	@GetMapping("/getProduct")
	public List<Product> getAllProduct(){
		
		return service.fetchProducts();
	}

}
