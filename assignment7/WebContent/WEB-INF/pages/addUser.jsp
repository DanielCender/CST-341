<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="container">
  <h3>User Sign Up</h3>
  <hr />
 <form:form method = "POST" action = "/assignment7/user/adduser" modelAttribute="user">
   <form:errors path="*"/>
   
   <div class="form-row">
   	<div class="form-group col-md-6">
      <form:label path="firstName" for="inputFirstName">First Name</form:label>
      <form:input type="text" class="form-control" id="inputFirstName" placeholder="First" path="firstName"></form:input>
    </div>
   <div class="form-group col-md-6">
      <form:label path="lastName" for="inputLastName">Last Name</form:label>
      <form:input type="text" class="form-control" id="inputLastName" placeholder="Last" path="lastName"></form:input>
    </div>
   </div>
   
   <fieldset class="form-group">
    <div class="row">
      <legend class="col-form-label col-sm-2 pt-0">Gender</legend>
      <div class="col-sm-10">
        <div class="form-check">
          <!-- <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="1" checked> -->
          <form:radiobutton class="form-check-input" path="gender" name="genderRadios" value="1" />
          <label class="form-check-label" for="gridRadios1">
            Male
          </label>
        </div>
        <div class="form-check">
         <!--  <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="2"> -->
         <form:radiobutton class="form-check-input" path="gender" name="genderRadios" value="2" />
          <label class="form-check-label" for="gridRadios2">
            Female
          </label>
        </div>
        <div class="form-check disabled">
          <!-- <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios3" value="3"> -->
          <form:radiobutton class="form-check-input" path="gender" name="genderRadios" value="3" />
          <label class="form-check-label" for="gridRadios3">
            Other
          </label>
        </div>
      </div>
      <form:errors path="gender" />
    </div>
  </fieldset>
  <div class="form-row">
   	  <button type="submit" class="btn btn-primary">Save</button>
    </div>
  </form:form>
 </div>

      
   