package com.gcu.business;

import java.util.List;

import com.gcu.model.Order;

public interface OrdersBusinessInterface {
	public List<Order> getAllOrders();
	public Boolean create(Order order);
	public void init();
	public void destroy();
}
