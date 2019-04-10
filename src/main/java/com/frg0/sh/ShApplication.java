package com.frg0.sh;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ShApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("APPLICATION STARTED !");
    }
}
