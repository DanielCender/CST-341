package com.gcu.business;

import org.springframework.stereotype.Component;

@Component
public class AnotherOrdersBusinessService implements OrdersBusinessInterface {
	public void test() {
		System.out.println("Hello from the AnotherOrdersBusinessService");
	}
}
