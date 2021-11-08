package com.company;

import java.util.Scanner;

public class Main {
    static Honda honda;
    private static Scanner scanner;

    private static void welcome() {
        System.out.println(" Welcome to Honda Service Company ");
        System.out.println("------------------------");
        System.out.println(" Select these options ");
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        honda = new Honda();
        welcome();
        selection();
    }

    public static void selection() {

        int choice;

        System.out.println("0. For exit ");
        System.out.println("1. For start the service ");
        System.out.println("---------------------" +
                "Please select an option: " +
                "---------------------");

        choice = scanner.nextInt();

        switch (choice) {

            case 0:
                System.out.println("Thanks for coming have a great day");
                return;

            case 1:
                System.out.println("Enter Your Name");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Enter Your Age");
                int age = scanner.nextInt();
                System.out.println("Enter Your Model");
                int model = scanner.nextInt();
                Customer customer = new Customer(name,age,model);
                honda.addCustomer(customer);
                honda.service(customer);

        }

        selection();
    }

}
