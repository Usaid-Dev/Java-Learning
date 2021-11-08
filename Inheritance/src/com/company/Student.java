package com.company;

public class Student extends Person {

    int rollNo;

    public Student(String name, String address, String phoneNumber, String email, int rollNo, int age) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.rollNo = rollNo;
        this.age = age;
    }

    void addAttendance(){
        this.rollNo=(10);
    }

}
