package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.gcu.business.OrdersBusinessInterface;
import com.gcu.business.OrdersBusinessService;
import com.gcu.controller.UserController;

@Configuration
class ApplicationConfiguration {
	@Bean(name="UserController") 
	public UserController getUserController() {
		return new UserController();
	}
	
	@Bean(name="OrdersService", initMethod="init", destroyMethod="destroy")
	@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public OrdersBusinessInterface getOrdersBusinessInterface() {
		return new OrdersBusinessService();
	}
}
