package com.example.NoConfigration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.NoConfigration")
public class javaConfig {
    @Autowired
    public Address getAddress(){
        return new Address();
    }

    @Bean
    public Student getStd(){
        Student student = new Student(getAddress());
        return student;
    }
}
