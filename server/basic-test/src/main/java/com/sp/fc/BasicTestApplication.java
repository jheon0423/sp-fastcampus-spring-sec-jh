package com.sp.fc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicTestApplication {
    public static void main(String[] args) {
        Person p = Person.builder().name("kim").build();
        System.out.println(p);
        // SpringApplication.run(BasicTestApplication.class, args);
    }
}
