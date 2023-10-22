package com.kessie.Service;


import com.kessie.Model.Transaction;
import com.kessie.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;


@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public Transaction transfer(Long senderAccount, Long receiverAccount, double amount){
        Transaction transaction = new Transaction();
        int transactionId = randomNumbers();
        transaction.setTransactionId(transactionId);
        transaction.setSenderAccount(senderAccount);
        transaction.setReceiverAccount(receiverAccount);
        transaction.setAmount(amount);

        transactionRepository.save(transaction);
        return transaction;
    }

    public int randomNumbers(){
        Random random = new Random();
        int max = 99999;
        int min = 10000;
        return random.nextInt(max - min + 1) + min;

    }

}
