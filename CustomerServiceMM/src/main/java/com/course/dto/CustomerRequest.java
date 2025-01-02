package com.course.dto;

import java.util.Date;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class CustomerRequest {
	/*private String name;
	private String contact;
	private String email;
	private Date dop;
	private boolean isCustomer;
	private double amount;*/
	
	@NotBlank(message = "Name cannot be empty or null")
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String name;

    @NotBlank(message = "Contact cannot be null or empty")
    //@Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits long")
    private String contact;

    @NotBlank(message = "Email cannot be empty or null")
    @Email(message = "Email must be a valid email address")
    private String email;

    @NotNull(message = "Date of Purchase cannot be null")
    @Past(message = "Date of Purchase must be in the past")
    private Date dop;

    @AssertTrue(message = "Customer flag must be true if they are a customer")
    private boolean isCustomer;

    @Min(value = 0, message = "Amount must be greater than or equal to 0")
    @Positive(message = "Amount must be a positive value")
    private double amount;
	

}
