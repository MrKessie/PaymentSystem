package com.kessie.Repository;


import com.kessie.Model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  UserRepository extends CrudRepository<User, Integer> {
    //@Query("INSERT INTO user WHERE user_id = @userId")
    User findByUserId(int userId);


}
