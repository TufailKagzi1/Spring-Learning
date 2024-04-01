package com.example.NoConfigration;

import org.springframework.stereotype.Component;

@Component
public class Student {
    Address address;

    public Student(Address address) {
        super();
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void Reading(){
        address.MyAddress();
        System.out.println("Student is reading!!");
    }
}
