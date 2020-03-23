package com.gcu.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gcu.model.Order;

public class OrdersDataService implements DataAccessInterface<Order> {
	// private Connection conn;
	// private String dbURL;
	// private String username;
	// private String password;

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("Hello there: " + this.jdbcTemplate.toString());
	}

	// public OrdersDataService() {
	// conn = null;
	// dbURL = "jdbc:derby:/Users/danielcender/MyDB;create=true";
	// username = "user";
	// password = "derby";
	// }

	// private Connection getConnection()
	// throws InstantiationException, IllegalAccessException,
	// ClassNotFoundException, SQLException {
	// Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	// this.conn = DriverManager.getConnection(dbURL, username, password);
	// return conn;
	// }

	/*
	 * Querying for all rows using default JDBC
	 * */
	// @Override
	// public List<Order> findAll() {
	// List<Order> list = new ArrayList<Order>();
	// try {
	// conn = getConnection();
	// Statement stmt = conn.createStatement();
	// String sql = "SELECT * FROM testapp.ORDERS";
	//
	// ResultSet rs = stmt.executeQuery(sql);
	//
	// while (rs.next()) {
	// Order order = new Order(String.valueOf(rs.getInt("ORDER_NO")),
	// rs.getString("PRODUCT_NAME"),
	// rs.getFloat("PRICE"));
	// System.out.println("Order ID: " + order.getOrderNo());
	// System.out.println("Product Name: " + order.getProductName());
	// System.out.println("Price: " + order.getPrice());
	// System.out.println("---");
	// list.add(order);
	// }
	// rs.close();
	//
	// } catch (InstantiationException | IllegalAccessException |
	// ClassNotFoundException | SQLException e) {
	// e.printStackTrace();
	// System.out.println("Failure!!");
	// } finally {
	// if (conn != null)
	// try {
	// conn.close();
	// } catch (SQLException e) {
	// System.out.println("Failed to close SQL connection!");
	// e.printStackTrace();
	// }
	// }
	// return list;
	// }

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

	// @Override
	// public boolean create(Order t) {
	// PreparedStatement create = null;
	// Integer result = 0;
	// try {
	// conn = getConnection();
	// String sql = "INSERT INTO testapp.ORDERS (ORDER_NO, PRODUCT_NAME, PRICE,
	// QUANTITY) VALUES(?,?,?,?)";
	// create = conn.prepareStatement(sql);
	//
	// create.setInt(1, Integer.parseInt(t.getOrderNo()));
	// create.setString(2, t.getProductName());
	// create.setFloat(3, t.getPrice());
	// create.setInt(4, 3);
	//
	// result = create.executeUpdate();
	// } catch (InstantiationException | IllegalAccessException |
	// ClassNotFoundException | SQLException e) {
	// e.printStackTrace();
	// System.out.println("Failure!!");
	// } finally {
	// if (conn != null)
	// try {
	// conn.close();
	// } catch (SQLException e) {
	// System.out.println("Failed to close SQL connection!");
	// e.printStackTrace();
	// }
	// }
	// return result > 0;
	// }

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
