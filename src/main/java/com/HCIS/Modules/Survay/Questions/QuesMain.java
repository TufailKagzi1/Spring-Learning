package com.HCIS.Modules.Survay.Questions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuesMain {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("QuesConfig.xml");
        Questions questions = (Questions) context.getBean("Ques");
        System.out.println(questions);
    }
}
