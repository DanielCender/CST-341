<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users List</title>
</head>
<body>
<h3>Users:</h3>
	<table>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Gender</th>
		<c:forEach var="user" items="${users}" varStatus="tagStatus">
			<tr>
				<td>${user.firstName}</td>
				<td>${user.lastName} </td>
				<td>
					 <c:choose>
         <c:when test = "${user.gender == 0}">
            Female
         </c:when>
         <c:when test = "${salary == 1}">
            Male
         </c:when>
         <c:otherwise>
            No comment sir...
         </c:otherwise>
      </c:choose>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>