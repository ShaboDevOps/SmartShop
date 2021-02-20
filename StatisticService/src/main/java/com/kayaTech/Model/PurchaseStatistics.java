package com.kayaTech.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PurchaseStatistics {
	
	@Id
	private String productName;
	private String date;
	private Long totalPurchase;
	private Double totalPurchaseWeek;
	private Double purchasePrice;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Long getTotalPurchase() {
		return totalPurchase;
	}
	public void setTotalPurchase(Long totalPurchase) {
		this.totalPurchase = totalPurchase;
	}
	public Double getTotalPurchaseWeek() {
		return totalPurchaseWeek;
	}
	public void setTotalPurchaseWeek(Double totalPurchaseWeek) {
		this.totalPurchaseWeek = totalPurchaseWeek;
	}
	public Double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	

}
