package com.kayaTech;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayaTech.Model.PurchasedProduct;

public interface PurchaseINF extends JpaRepository<PurchasedProduct, String> {

}
