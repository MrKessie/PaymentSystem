package com.kessie.Controller;


import com.kessie.Model.Transaction;
import com.kessie.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;
    @PostMapping("/transfer")
    @ResponseBody
    public Transaction transfer(@RequestParam Long senderAccount,
                                @RequestParam Long receiverAccount,
                                @RequestParam double amount){
    Transaction transfer = transactionService.transfer(senderAccount, receiverAccount, amount);
    return  transfer;
    }

}
