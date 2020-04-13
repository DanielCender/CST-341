<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>


<h3>User Sign Up Result:</h3>
<table>
	<tr>
		<td>First Name:</td>
		<td>${user.firstName}</td>
	</tr>
	<tr>
		<td>Last Name:</td>
		<td>${user.lastName}</td>
	</tr>
</table>