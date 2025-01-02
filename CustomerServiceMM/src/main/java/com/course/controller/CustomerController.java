package com.course.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.dto.CustomerRequest;
import com.course.dto.CustomerResponse;
import com.course.service.CustomerService;

@RestController
@RequestMapping
public class CustomerController {
    @Autowired
    CustomerService customerService;
    
    @PostMapping("/add")
	public CustomerResponse addCustomer(@RequestBody CustomerRequest customerRequest) {
		return customerService.addCustomer(customerRequest);	
	}
    
    @GetMapping("/getCustomerList")
	public List <CustomerResponse> getCustomerList() {
		return customerService.getCustomerList();	
	}
    @GetMapping("/getCustomerById/{id}")
	public CustomerResponse getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);	
	}
    
    @DeleteMapping("/deleteCustomerById/{id}")
    public void deleteCustomer(@PathVariable int id) {
    	customerService.deleteCustomer(id);
    }
    
    @PutMapping("/updateCustomer/{id}")
    public CustomerResponse updateCustomer(@PathVariable int id, @RequestBody CustomerRequest customerRequest) {
    	return customerService.updateCustomer(id, customerRequest);
    }
    
    @GetMapping("/getCustomerByName/{name}")
    public List<CustomerResponse> getCustomerByName(@PathVariable String name) {
    	return customerService.getCustomerByName(name);
    	}
    @GetMapping("/getCustomerByName/{email}")
    public List<CustomerResponse> getCustomerByEmail(@PathVariable String email) {
    		return customerService.getCustomerByEmail(email);
    }
    
   // pagination
    @GetMapping("/customersWithPagination/{pageNumber}/{pageSize}")
 	public Page<CustomerResponse> findCustomersWithPagination(int pageNumber, int pageSize) {
 		return (Page<CustomerResponse>) customerService.findCustomersWithPagination(pageNumber, pageSize);
 	}

 	// sort by field
    @GetMapping("/customerSortByField/{field}")
 	public List<CustomerResponse> customerSortByField(String field) {
 		return customerService.customerSortByField(field);
 	}

 	// pagination and sort by field
    @GetMapping("/customersWithPaginationAndSorting/{pageNumber}/{pageSize}/{field}")
 	public Page<CustomerResponse> findCustomerssWithPaginationAndSorting(int pageNumber, int pageSize, String field) {
 		return customerService.findCustomerssWithPaginationAndSorting(pageNumber, pageSize, field);
 	}
}
