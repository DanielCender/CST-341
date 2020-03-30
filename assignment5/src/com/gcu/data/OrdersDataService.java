package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gcu.model.Order;

public class OrdersDataService implements DataAccessInterface<Order> {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Order> findAll() {
		List<Order> list = new ArrayList<Order>();
		String sql = "SELECT * FROM testapp.ORDERS";
		list = jdbcTemplate.query(sql, new OrderRowMapper());
		return list;
	}

	@Override
	public Order findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Order t) {
		Integer result = 0;

		String sql = "INSERT INTO testapp.ORDERS (ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES(?,?,?,?)";
		result = jdbcTemplate.update(sql, t.getOrderNo(), t.getProductName(), t.getPrice(), t.getQuantity());

		return result > 0;
	}

	@Override
	public boolean update(Order t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Order t) {
		// TODO Auto-generated method stub
		return false;
	}
}
