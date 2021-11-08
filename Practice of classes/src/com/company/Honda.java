package com.company;

import java.util.ArrayList;

public class Honda {

    ArrayList<Customer> customers;
    Honda() { customers = new ArrayList<>();}

    void addCustomer(Customer customer) { customers.add(customer);}

    void service(Customer customer){
        System.out.println(customer.name+" Car ("+customer.car.model+") is servicing!");
    }
}
