package com.kessie.Service;


import com.kessie.Model.Account;
import com.kessie.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account deposit(Long accountNumber, double amount){
        Account account = accountRepository.findByAccountNumber(accountNumber);
        double currentBalance = account.getAccountBalance();
        double newBalance = currentBalance + amount;
        account.setAccountBalance(newBalance);
        accountRepository.save(account);
        System.out.println("New balance: " + newBalance);
        return account;
    }

    public Account withdraw(Long accountNumber, double amount){
        Account account = accountRepository.findByAccountNumber(accountNumber);
        double currentBalance = account.getAccountBalance();
        double newBalance = currentBalance - amount;
        account.setAccountBalance(newBalance);
        accountRepository.save(account);

        return account;
    }

    public double checkBalance(Long accountNumber, double amount){
        Account account = accountRepository.findByAccountNumber(accountNumber);
        return account.getAccountBalance();
    }

    public List<Account> getAllAccounts(){
        //System.out.println("All service accounts have been called");
        List <Account> account = (List<Account>) accountRepository.findAll();
        //System.out.println("Account is "+ account.size());
        return account;
    }

    public Account addAccount(double startCapital){
        Long accountNumber = (long) randomNumbers();
        Account account = new Account();
        account.setAccountBalance(startCapital);
        account.setAccountNumber(accountNumber);
        accountRepository.save(account);
        return account;
    }

    public Account removeAccount(Long accountNumber){
        Account account = accountRepository.findByAccountNumber(accountNumber);
        accountRepository.delete(account);
        return account;
    }

    public int randomNumbers(){
        Random random = new Random();
        int max = 99999;
        int min = 10000;
        return random.nextInt(max - min + 1) + min;

    }

}


