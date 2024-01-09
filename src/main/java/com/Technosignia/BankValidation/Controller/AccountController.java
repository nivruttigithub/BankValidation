package com.Technosignia.BankValidation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Technosignia.BankValidation.DTO.AccountRequest;
import com.Technosignia.BankValidation.Entity.Account;
import com.Technosignia.BankValidation.Exception.AccountNotFoundException;
import com.Technosignia.BankValidation.Service.AccountService;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService service;

	@PostMapping("/signup")
	public ResponseEntity<Account> saveAccount(@RequestBody @Valid AccountRequest accountRequest) {
		return new ResponseEntity<>(service.saveAccount(accountRequest), HttpStatus.CREATED);
		// return service.saveUser(userRequest);
	}

	@GetMapping("/fetchAll")
	public ResponseEntity<List<Account>> getAllUsers() {
		return ResponseEntity.ok(service.getAllUsers());
	}

	@GetMapping("/{accno}")
	public ResponseEntity<Account> getUser(@PathVariable int accno) throws AccountNotFoundException {
		return ResponseEntity.ok(service.getAccount(accno));
	}
}
