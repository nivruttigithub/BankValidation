package com.Technosignia.BankValidation.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.BankValidation.DTO.CustomerRequest;
import com.Technosignia.BankValidation.Entity.Customer;
import com.Technosignia.BankValidation.Exception.CustomerNotFoundException;
import com.Technosignia.BankValidation.Repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public Customer saveCustomer(CustomerRequest customerRequest) {
		Customer customer = Customer.build(0,
				customerRequest.getName(),
				customerRequest.getAge(), 
				customerRequest.getAddress(), 
				customerRequest.getContact(),
				customerRequest.getEmail());
		return repository.save(customer);
	}

	public List<Customer> getAllCustomers() {
		return repository.findAll();
	}

	public Customer getCustomer(int id) throws CustomerNotFoundException {
		Customer customer = repository.findByid(id);
		if (customer != null) {
			return customer;
		} else {
			throw new CustomerNotFoundException("Customer not found with id : " + id);
		}
	}
}
