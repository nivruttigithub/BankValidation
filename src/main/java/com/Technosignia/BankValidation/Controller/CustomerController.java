package com.Technosignia.BankValidation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Technosignia.BankValidation.DTO.CustomerRequest;
import com.Technosignia.BankValidation.Entity.Customer;
import com.Technosignia.BankValidation.Exception.CustomerNotFoundException;
import com.Technosignia.BankValidation.Service.CustomerService;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping("/signup")
	public ResponseEntity<Customer> saveUser(@RequestBody @Valid CustomerRequest customerRequest) {
		return new ResponseEntity<>(service.saveCustomer(customerRequest), HttpStatus.CREATED);
	}

	@GetMapping("/fetchAll")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		return ResponseEntity.ok(service.getAllCustomers());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Customer> getUser(@PathVariable int id) throws CustomerNotFoundException {
		return ResponseEntity.ok(service.getCustomer(id));
	}
}