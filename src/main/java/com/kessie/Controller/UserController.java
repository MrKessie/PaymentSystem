package com.kessie.Controller;


import com.kessie.Model.User;
import com.kessie.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/users")

public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/change/username")
    @ResponseBody
    public User changeUsername(@RequestParam int userId, @RequestParam String name){
        User newName = userService.changeUsername(userId, name);
        return newName;
    }

    @PostMapping("/add/user")
    @ResponseBody
    public User addUser(@RequestParam String name){
        User user = userService.addUser(name);
        return user;
    }

    @PostMapping("/remove/user")
    @ResponseBody
    public User removeUser(@RequestParam int userId){
        User user = userService.removeUser(userId);
        return user;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<User> getAllUsers(){
        List<User> user = userService.getAllUsers();
        return user;
    }
}
