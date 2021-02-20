package com.kayaTech.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sales {
	
	@Id
	private String date;
	private Double totalAmount;
	private String day;
	private Double profit;
	private Double dept;
	private Double reservedAmount;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getProfit() {
		return profit;
	}
	public void setProfit(Double profit) {
		this.profit = profit;
	}
	public Double getDept() {
		return dept;
	}
	public void setDept(Double dept) {
		this.dept = dept;
	}
	public Double getReservedAmount() {
		return reservedAmount;
	}
	public void setReservedAmount(Double reservedAmount) {
		this.reservedAmount = reservedAmount;
	}
	

}