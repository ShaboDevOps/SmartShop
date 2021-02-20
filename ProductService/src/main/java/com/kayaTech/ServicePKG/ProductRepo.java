package com.kayaTech.ServicePKG;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayaTech.Model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
