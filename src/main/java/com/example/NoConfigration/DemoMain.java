package com.example.NoConfigration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DemoMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
        Student student = context.getBean("getStd", Student.class);
        System.out.println(student);
        student.Reading();
    }
}
