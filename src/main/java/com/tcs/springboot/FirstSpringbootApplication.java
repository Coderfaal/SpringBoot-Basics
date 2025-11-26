package com.tcs.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class FirstSpringbootApplication implements ApplicationRunner {

    @Autowired
    ProductRepository repository;
	public static void main(String[] args) {

        SpringApplication.run(FirstSpringbootApplication.class, args);
	}

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //this block will definately execute at the end of main , but will not run concurrently
        Product p1 = new Product();
        p1.setPid(110L);
        p1.setDescription("Charger");
        p1.setPurchasedOn("2025,11,26");
        p1.setQty(15);
        p1.setPrice(250);

        repository.save(p1);
        System.out.println(p1);




    }
}
