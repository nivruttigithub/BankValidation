package com.Technosignia.BankValidation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.BankValidation.DTO.AccountRequest;
import com.Technosignia.BankValidation.Entity.Account;
import com.Technosignia.BankValidation.Exception.AccountNotFoundException;
import com.Technosignia.BankValidation.Repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;


    public Account saveAccount(AccountRequest accountRequest) {
        Account account = Account.build(0,accountRequest.getAccholdername(), accountRequest.getAccbalance(), accountRequest.getAcctype(),accountRequest.getBankname());
        		

        return repository.save(account);
    }


    public List<Account> getAllUsers() {
        return repository.findAll();
    }


    public Account getAccount(int accno) throws AccountNotFoundException {
        Account user= repository.findByaccno(accno);
        if(user!=null){
            return user;
        }else{
            throw new AccountNotFoundException("User not found with id : "+accno);
        }
    }
}