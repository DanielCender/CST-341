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

<table>
	<thead>
		<tr>
			<th>Row</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Information</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td>Daniel</td>
			<td>Cender</td>
			<td style="min-width:100px;max-width:150px">A student at GCU</td>
		</tr>
		<tr>
			<td>1</td>
			<td>Max</td>
			<td>Aurelius</td>
			<td style="min-width:100px;max-width:150px">A student at GCU</td>
		</tr>
		<tr>
			<td>1</td>
			<td>Dax</td>
			<td>Shepherd</td>
			<td style="min-width:100px;max-width:150px">A student at GCU</td>
		</tr>
		<tr>
			<td>1</td>
			<td>Ginny</td>
			<td>Weaver</td>
			<td style="min-width:100px;max-width:150px">A student at GCU</td>
		</tr>
	</tbody>
</table>

<script>
	var getOrders = function() {
		$.ajax({
				type: "GET",
				url: "/assignment7/service1/orders",
				dataType: "json",
				success: function(data)
				{
					// Display Orders in the jQuery Data Table
					$('#orders').dataTable({
					/* "responsive": true, */
					"data": data,
					"columns": [{ "data": "orderNo" },{ "data": "productName" },{ "data": "price" },{ "data": "quantity" }]
					});
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
