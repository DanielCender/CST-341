<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
<h3>Orders:</h3>
	<table id="orders">
	<th>Order ID:</th>
	<th>Product Name:</th>
	<th>Price:</th>
		<c:forEach var="order" items="${orders}" varStatus="tagStatus">
			<tr>
				<td>${order.orderNo}</td>
				<td>${order.productName} </td>
				<td>${order.price}</td>
			</tr>
		</c:forEach>
	</table>
	

</div>

	
<script>
$('#orders').dataTable({
	"responsive" : true,
});
</script>