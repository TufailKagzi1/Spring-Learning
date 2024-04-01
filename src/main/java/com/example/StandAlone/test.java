package com.example.StandAlone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class test {
    List<String> subject;
    Map<Integer,String> subjectWithId;
    Properties properties;

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public Map<Integer, String> getSubjectWithId() {
        return subjectWithId;
    }

    public void setSubjectWithId(Map<Integer, String> subjectWithId) {
        this.subjectWithId = subjectWithId;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "test{" +
                "subject=" + subject +
                ", subjectWithId=" + subjectWithId +
                ", properties=" + properties +
                '}';
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standAloneConfig.xml");
        test test1 = context.getBean("listHail",test.class);
        System.out.println(test1.getSubject());
        System.out.println("---------------------");
        System.out.println(test1.getSubjectWithId());
        System.out.println("---------------------");
        System.out.println(test1.getProperties());
        System.out.println("---------------------");

    }
}
