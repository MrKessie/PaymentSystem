package com.kessie.Service;


import com.kessie.Model.User;
import com.kessie.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public User changeUsername(int userId, String name){
        User user = userRepository.findByUserId(userId);
        user.setUsername(name);
        userRepository.save(user);
        return user;
    }

    public User addUser(String name){
        int userId = randomNumbers();
        User user = new User();
        user.setUserId(userId);
        user.setUsername(name);
        //System.out.println("Random number: " + userId);
        userRepository.save(user);
        return user;
    }

    public User removeUser(int userId){
        User user = userRepository.findByUserId(userId);
        userRepository.delete(user);
        //userRepository.save(user);
        return user;
    }

    public List<User> getAllUsers(){
        List<User> user = (List<User>) userRepository.findAll();
        return user;
    }

    public int randomNumbers(){
        Random random = new Random();
        int min = 10000;
        int max = 99999;
        return random.nextInt(max - min +1) + min;
    }

}
