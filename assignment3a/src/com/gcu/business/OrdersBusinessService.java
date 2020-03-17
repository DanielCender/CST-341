package com.gcu.business;

import org.springframework.stereotype.Component;

@Component
public class OrdersBusinessService implements OrdersBusinessInterface {
	public void test() {
		System.out.println("Hello from the OrdersBusinessService");
	}
}
