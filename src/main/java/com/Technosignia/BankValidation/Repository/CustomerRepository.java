package com.Technosignia.BankValidation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.BankValidation.Entity.Customer;
@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Integer>{
 Customer findByid(int id);
}
