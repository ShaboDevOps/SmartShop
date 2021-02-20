package com.kayaTech.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOST-REQUIRED-PRODUCTS")
public class RequiredProduct {
	
	@Id
	private String productName;
	private Long totalPurchaseMonth;
	private Double totalProfit;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Long getTotalPurchaseMonth() {
		return totalPurchaseMonth;
	}
	public void setTotalPurchaseMonth(Long totalPurchaseMonth) {
		this.totalPurchaseMonth = totalPurchaseMonth;
	}
	public Double getTotalProfit() {
		return totalProfit;
	}
	public void setTotalProfit(Double totalProfit) {
		this.totalProfit = totalProfit;
	}
	

}
