package com.kayaTech.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PurchasedProduct {
	
	@Id
	private String productName;
	private String productId;
	private Double purchasePrice;
	private Double salePrice;
	private Double expectedProductProfit;
	private Double totalProfit;
	private String purchaseDate;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public Double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
	public Double getExpectedProductProfit() {
		return expectedProductProfit;
	}
	public void setExpectedProductProfit(Double expectedProductProfit) {
		this.expectedProductProfit = expectedProductProfit;
	}
	public Double getTotalProfit() {
		return totalProfit;
	}
	public void setTotalProfit(Double totalProfit) {
		this.totalProfit = totalProfit;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	
	
	

}
