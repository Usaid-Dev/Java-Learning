package com.company;

/* extends = instance
 Inheritence = same class contains many objects , We can also change some specific things from our class
 Polymorphism = we can access all classes from one code

 */
public class Teacher extends Person{

    String subject;

    public Teacher(String name, String address, String phoneNumber, String email, String subject, int age) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.subject = subject;
        this.age = age;
    }

    void addSubjects () {
        this.subject=("chemistry");

    }

}
