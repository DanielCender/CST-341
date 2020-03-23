package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.Order;

public class OrdersBusinessService implements OrdersBusinessInterface {
	@Autowired
	DataAccessInterface<Order> service;
	
	public void setDataAccessInterface(DataAccessInterface<Order> service) {
		this.service = service;
	}
	
	public List<Order> getAllOrders() {
		return service.findAll();
	}
	
	public Boolean create(Order order) {
		return service.create(order);
	}
	
	public void init() {
		System.out.println("Init method - " + this.getClass().getName());
	}
	public void destroy() {
		System.out.println("Destroy method - " + this.getClass().getName());
	}
}
