package com.meghana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.meghana")
public class StudentgradesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentgradesystemApplication.class, args);
    }

}