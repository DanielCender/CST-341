package com.gcu;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.gcu.business.OrdersBusinessInterface;
import com.gcu.business.OrdersBusinessService;
import com.gcu.controller.UserController;
import com.gcu.data.DataAccessInterface;
import com.gcu.data.OrdersDataService;
import com.gcu.model.Order;
import com.gcu.services.UserService1;

@Configuration
class ApplicationConfiguration {
	@Bean(name="UserController") 
	public UserController getUserController() {
		return new UserController();
	}
//	
//	@Bean(name="UserService1")
//	public UserService1 getUserService1() {
//		return new UserService1();
//	}
	
	@Bean(name="OrdersService", initMethod="init", destroyMethod="destroy")
	@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public OrdersBusinessInterface getOrdersBusinessInterface() {
		return new OrdersBusinessService();
	}
	
	@Bean(name="Service")
	public DataAccessInterface<Order> getDataAccessInterface() {
		return new OrdersDataService();
	}
	
	@Bean(name="jdbcTemplate")
	@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
	public DriverManagerDataSource getDataSource(DataSource dataSource) {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.apache.derby.jdbc.EmbeddedDriver");
		ds.setUrl("jdbc:derby:/Users/danielcender/MyDB");
		ds.setUsername("user");
		ds.setPassword("derby");
		return ds;
	}
	
}
