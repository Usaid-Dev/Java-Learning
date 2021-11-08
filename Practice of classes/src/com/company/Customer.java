package com.company;

public class Customer {
    String name;
    int age;
    Car car;

    Customer(String name, int age, int model) {
        this.name = name;
        this.age = age;
        car = new Car(model);
    }


}


