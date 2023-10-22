package com.kessie.Repository;


import com.kessie.Model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
    Transaction findByTransactionId(int transactionId);

    Transaction findBySenderAccount(Long senderAccount);
}
