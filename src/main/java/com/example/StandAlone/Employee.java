package com.example.StandAlone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("compConfig.xml");
        Person p1 = context.getBean("person", Person.class);
        System.out.println(p1);
    }
}
