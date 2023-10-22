package com.kessie.Repository;


import com.kessie.Model.Account;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    //@Query("UPDATE `account` SET `account_balance`=  WHERE account_number = 12345")
    Account findByAccountNumber(Long accountNumber);
    //Account save();
}
