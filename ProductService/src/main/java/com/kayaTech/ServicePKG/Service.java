package com.kayaTech.ServicePKG;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.kayaTech.Model.Product;

@Component
public class Service {
	
	@Autowired
	private ProductRepo proRepo;

	public List<Product> fetchProducts() {

		return proRepo.findAll();
	}

	public List<Product> addProducts(List<Product> product) {
		
		return proRepo.saveAll(product);
	}

}
