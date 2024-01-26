package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository repo;
	
	@GetMapping("/customer")
	@ResponseBody
	public Iterable<Customer> customer() {
		return repo.findAll();
	}
}
