package com.example.demo.customer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.customer.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	public List<Customer> findByfirstName(String firstName);
}
