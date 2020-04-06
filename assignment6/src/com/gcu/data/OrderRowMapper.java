package com.gcu.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gcu.model.Order;

public class OrderRowMapper implements RowMapper<Order> {
	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order = new Order();
		order.setOrderNo(rs.getString("ORDER_NO"));
		order.setProductName(rs.getString("PRODUCT_NAME"));
		order.setPrice(rs.getFloat("PRICE"));
		return order;
}
}