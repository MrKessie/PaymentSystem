package com.kessie.Controller;


import com.kessie.Model.Account;
import com.kessie.Model.User;
import com.kessie.Service.AccountService;
import com.kessie.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    AccountService accountService;
    @Autowired
    UserService userService;
    @PostMapping("/deposit")
    @ResponseBody
    public Account deposit(@RequestParam Long accountNumber, @RequestParam double amount){
        Account account = accountService.deposit(accountNumber, amount);
        System.out.println("Deposit successful");
        return account;
    }
    @PostMapping("/withdraw")
    @ResponseBody
    public Account withdraw(@RequestParam Long accountNumber, @RequestParam double amount){
        Account account = accountService.withdraw(accountNumber, amount);
        return account;
    }

    @PostMapping("/add/account")
    @ResponseBody
    public Account addAccount(@RequestParam double startingBalance){
        Account account = accountService.addAccount(startingBalance);
        return  account;
    }

    @PostMapping("/remove/account")
    @ResponseBody
    public Account removeAccount(@RequestParam Long accountNumber){
        Account account = accountService.removeAccount(accountNumber);
        return account;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Account> allAccounts(){
        //System.out.println("All accounts have been called");
        List<Account> account = accountService.getAllAccounts();
        //System.out.println("Account is " + account.get(0).getAccountBalance());
        //System.out.println("Account is " + account.get(0).getAccountNumber());
        return account;
    }


}
