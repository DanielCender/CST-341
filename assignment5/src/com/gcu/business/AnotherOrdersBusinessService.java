package com.gcu.business;

import java.util.List;

import org.springframework.stereotype.Component;

import com.gcu.model.Order;

public class AnotherOrdersBusinessService implements OrdersBusinessInterface {
	public List<Order> getAllOrders() {
		return null;
	}
	public Boolean create(Order order) {
		return null;
	}
	public void test() {
		System.out.println("Hello from the AnotherOrdersBusinessService");
	}
	public void init() {
		System.out.println("Init method - " + this.getClass().getName());
	}
	public void destroy() {
		System.out.println("Destroy method - " + this.getClass().getName());
	}
}
