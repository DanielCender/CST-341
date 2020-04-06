<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<table style="width: 50%; border: 1px black solid;" id="orders" class="display">
	<thead>
		<tr>
			<th style="width: 25%;">Order Number</th>
			<th style="width: 25%;">Product Name</th>
			<th style="width: 25%;">Price</th>
			<th style="width: 25%;">Quantity</th>
		</tr>
	</thead>
	<tbody>
		<!-- Body will be inserted by AJAX request results -->
	</tbody>
</table>

<script>
	var getOrders = function() {
		$.ajax(
				{
				type: "GET",
				url: "/assignment6/service1/orders",
				dataType: "json",
				success: function(data)
				{
					// Display Orders in the jQuery Data Table
					$('#orders').dataTable({
					"data": data,
					"columns": [{ "data": "orderNo" },{ "data": "productName" },{ "data": "price" },{ "data": "quantity" }]
					} );
				   },
				error: function (xhr, ajaxOptions, thrownError) 
				{
				alert(xhr.status);
				alert(thrownError);
				}
				});
	};
	
	$(document).ready(getOrders);
</script>
