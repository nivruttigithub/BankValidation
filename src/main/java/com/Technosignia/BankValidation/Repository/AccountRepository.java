package com.Technosignia.BankValidation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.BankValidation.Entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	Account findByaccno(int accno);
}