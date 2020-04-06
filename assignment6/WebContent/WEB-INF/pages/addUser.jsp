<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h3>User Sign Up</h3>
 <form:form method = "POST" action = "/assignment6/user/adduser" modelAttribute="user">
   <form:errors path="*"/>
         <table>
            <tr>
               <td><form:label path = "firstName">First Name</form:label></td>
               <td><form:input path = "firstName" /></td>
               <form:errors path="firstName" />
            </tr>
            <tr>
               <td><form:label path = "lastName">Last Name</form:label></td>
               <td><form:input path = "lastName" /></td>
               <form:errors path="lastName" />
            </tr>  
            <tr>
            <td>
            	<form:radiobutton path="gender" value="1"/>Male
            	<form:radiobutton path="gender" value="2"/>Female
            	<form:radiobutton path="gender" value="3"/>Other
            	 <form:errors path="gender" />
            </td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>
      </form:form>