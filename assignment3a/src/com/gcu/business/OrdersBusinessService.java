package com.gcu.business;

import org.springframework.stereotype.Component;

public class OrdersBusinessService implements OrdersBusinessInterface {
	public void test() {
		System.out.println("Hello from the OrdersBusinessService");
	}
	public void init() {
		System.out.println("Init method - " + this.getClass().getName());
	}
	public void destroy() {
		System.out.println("Destroy method - " + this.getClass().getName());
	}
}
