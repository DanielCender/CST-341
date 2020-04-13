<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<table style="width: 50%; border: 1px black solid;" id="orders">
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
	var displayOrders = function(orders) {
		var x = 0;
		var y = 0;
		var table = document.getElementById("orders");
		for (var i = 0; i < orders.length; i += 1)
		{
		var order = orders[i];
		var row = table.insertRow(-1);
		row.setAttribute("align", "center");
		var cell1 = row.insertCell();
		var cell2 = row.insertCell();
		var cell3 = row.insertCell();
		var cell4 = row.insertCell();
		row.id = x;
		cell1.id = x + "_" + y++;
		cell2.id = x + "_" + y++;
		cell3.id = x + "_" + y++;
		cell4.id = x + "_" + y++;
		cell1.innerHTML = order.orderNo;
		cell2.innerHTML = order.productName;
		cell3.innerHTML = order.price;
		cell4.innerHTML = order.quantity;
		row.style.backgroundColor = x & 1 ? "#FFFFFF" : "#F0F0F0";
		++x;
		y = 0;
		}
	};
	
	
	var getOrders = function() {
		$.ajax(
				{
				type: "GET",
				url: "/assignment7/service1/orders",
				dataType: "json",
				success: function(data)
				{
				displayOrders(data);
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
