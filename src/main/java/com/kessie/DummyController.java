package com.kessie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DummyController {
    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World";
    }
}
