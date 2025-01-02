package com.course.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.course.dto.CustomerRequest;
import com.course.dto.CustomerResponse;
import com.course.entity.Customer;
import com.course.repository.CustomerRepository;

@Service
public class CustomerService {
	// addCustomer
	// deleteCustomer
	// updateCustomer
	// getCustomerById
	// getCustomerList

	@Autowired
	ModelMapper modelMapper;
	@Autowired
	CustomerRepository customerRepository;

	public CustomerResponse addCustomer(CustomerRequest customerRequest) {
		Customer customer = modelMapper.map(customerRequest, Customer.class);
		return modelMapper.map(customerRepository.save(customer), CustomerResponse.class);
	}

	public CustomerResponse getCustomerById(int id) {
		Optional<Customer> customer = customerRepository.findById(id);
		return modelMapper.map(customer, CustomerResponse.class);
	}

	/*
	 * findAll(): Fetches all customer entities. stream(): Converts the list into a
	 * stream. map(): Transforms each Customer entity into a CustomerResponse DTO
	 * using ModelMapper. collect(): Collects the transformed DTOs into a list
	 */
	public List<CustomerResponse> getCustomerList() {
		return customerRepository.findAll().stream().map(entity -> modelMapper.map(entity, CustomerResponse.class))
				.collect(Collectors.toList());

	}

	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}

	public CustomerResponse updateCustomer(int id, CustomerRequest newCustomerRequest) {
		// Search ExistingCustomer
		Optional<Customer> existingCustomer = customerRepository.findById(id);
		if (existingCustomer.isPresent()) {
			Customer newCustomer = modelMapper.map(newCustomerRequest, Customer.class);
			newCustomer.setId(id);
			return modelMapper.map(customerRepository.save(newCustomer), CustomerResponse.class);
		}
		return null;
	}

	public List<CustomerResponse> getCustomerByName(String name) {
		return customerRepository.getCustomerByName(name).stream()
				.map(entity -> modelMapper.map(entity, CustomerResponse.class)).collect(Collectors.toList());
	}

	public List<CustomerResponse> getCustomerByEmail(String name) {
		return customerRepository.getCustomerByEmail(name).stream()
				.map(entity -> modelMapper.map(entity, CustomerResponse.class)).collect(Collectors.toList());
	}

	// pagination
	public Page<CustomerResponse> findCustomersWithPagination(int pageNumber, int pageSize) {

		Pageable pageable = PageRequest.of(pageNumber, pageSize);

		// Fetch the paginated result from the repository
		Page<Customer> customersPage = customerRepository.findAll(pageable);

		// Map the customer entities to DTOs
		List<CustomerResponse> CustomerResponseList = customersPage.getContent().stream()
				.map(customer -> modelMapper.map(customer, CustomerResponse.class)).collect(Collectors.toList());

		// Return a Page<CustomerDTO>
		return new PageImpl<>(CustomerResponseList, pageable, customersPage.getTotalElements());

	}

	// sort by field
	public List<CustomerResponse> customerSortByField(String field) {
		// Fetch sorted customers based on the field in ascending order
		List<Customer> customers = customerRepository.findAll(Sort.by(Sort.Direction.ASC, field));

		// Map the customer entities to CustomerResponse DTOs using ModelMapper
		return customers.stream().map(entity -> modelMapper.map(entity, CustomerResponse.class))
				.collect(Collectors.toList());
	}

	// pagination and sort by field
	public Page<CustomerResponse> findCustomerssWithPaginationAndSorting(int pageNumber, int pageSize, String field) {
		// Create Pageable object with pagination and sorting
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(field));

		// Fetch paginated results with sorting
		Page<Customer> customerPage = customerRepository.findAll(pageable);

		// Map the Customer entities to CustomerResponse DTOs using ModelMapper
		Page<CustomerResponse> customerResponsePage = customerPage
				.map(entity -> modelMapper.map(entity, CustomerResponse.class));

		// Return the paginated CustomerResponse Page
		return customerResponsePage;
	}

}
