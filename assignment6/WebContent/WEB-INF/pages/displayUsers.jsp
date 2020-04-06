<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
         <c:when test = "${user.gender == 2}">
            Female
         </c:when>
         <c:when test = "${user.gender == 1}">
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