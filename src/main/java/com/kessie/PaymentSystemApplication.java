package com.kessie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
//@ComponentScan(basePackages = {"com.kessie"})
public class PaymentSystemApplication {


	public static void main(String[] args) {

		SpringApplication.run(PaymentSystemApplication.class, args);
	}

}
