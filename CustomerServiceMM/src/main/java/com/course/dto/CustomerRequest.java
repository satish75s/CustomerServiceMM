package com.course.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {
	private String name;
	private String contact;
	private String email;
	private Date dop;
	private boolean isCustomer;
	private double amount;

}
