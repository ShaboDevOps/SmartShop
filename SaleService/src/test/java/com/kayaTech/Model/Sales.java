package com.kayaTech.Model;

import java.time.DayOfWeek;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.crypto.Data;

@Entity
public class Sales {
	
	@Id
	private Data date;
	private DayOfWeek day;
	private Double totalAmount;
	private Double profit;
	private Double deptAmount;
	private Double reservedAmount;
	public Data getDate() {
		return date;
	}
	public void setDate(Data date) {
		this.date = date;
	}
	public DayOfWeek getDay() {
		return day;
	}
	public void setDay(DayOfWeek day) {
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
	public Double getDeptAmount() {
		return deptAmount;
	}
	public void setDeptAmount(Double deptAmount) {
		this.deptAmount = deptAmount;
	}
	public Double getReservedAmount() {
		return reservedAmount;
	}
	public void setReservedAmount(Double reservedAmount) {
		this.reservedAmount = reservedAmount;
	}

	
}