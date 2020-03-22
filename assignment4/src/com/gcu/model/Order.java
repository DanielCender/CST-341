package com.gcu.model;

public class Order {
	private String orderNo;
	private String productName;
	private Float price;
	private int quantity;
	
	public Order(String orderNo, String productName, Float price) {
		this.orderNo = orderNo;
		this.productName = productName;
		this.price = price;
	}
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
