package com.gcu.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	/**
	 * @param firstName
	 * @param lastName
	 * @param gender
	 */
	public User(
			@NotNull(message = "First name cannot be null") @Size(min = 2, max = 50, message = "First name must be between 2 and 50 chars") String firstName,
			@NotNull(message = "Last name cannot be null") @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 chars") String lastName,
			@NotNull(message = "Gender cannot be null") @Min(value = 1, message = "Last name must be more than 1 character") @Max(value = 50, message = "Last name must be less than 50 characters") Integer gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	@NotNull(message = "First name cannot be null") @Size(min=2,max=50,message="First name must be between 2 and 50 chars")
	private String firstName;
	
	@NotNull(message = "Last name cannot be null") @Size(min=2,max=50,message="Last name must be between 2 and 50 chars")
	private String lastName;
	
	@NotNull(message = "Gender cannot be null")
	@Min(value = 1, message="Last name must be more than 1 character")
	@Max(value = 50, message="Last name must be less than 50 characters")
	private Integer gender;
	
	public User() {}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}
	

}
