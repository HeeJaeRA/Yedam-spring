package com.example.demo.customer.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.domain.Customer;
import com.example.demo.customer.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository repo;
	
	@GetMapping("/customer")
	public Iterable<Customer> customer() {
		return repo.findAll();
	}
	
	//localhost/regCustomer?fname=gildong&lname=hong
	@GetMapping("/regCustomer")
	public Customer regCustomer(String fname, String lname) {
		return repo.save(new Customer(fname, lname));
	}
	
	@GetMapping("/findCustomer/{firstName}")
	public List<Customer> findCustomer(@PathVariable String firstName) {
		return repo.findByfirstName(firstName);
	}
}
