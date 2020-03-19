package com.gcu.business;

import org.springframework.stereotype.Component;

public class AnotherOrdersBusinessService implements OrdersBusinessInterface {
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
