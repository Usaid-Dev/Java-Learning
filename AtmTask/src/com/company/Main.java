package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner in;
    private static float balance = 0; // For everyone they will get 0
    private static int anotherTransaction;
    private static ArrayList<String> logs;

    private static void pin() {
        System.out.println("Enter Your Pin Code and please input number not alphabet");
        int input = in.nextInt();
        if (input == 1234) {
            transaction();
        } else {
            System.out.println("Invalid.. Please Try Again");
            pin();
        }
    }

    private static void greetings() {
        System.out.println("Welcome to Atm you can withdraw, deposit, and balance you have $0");
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        logs = new ArrayList<>();
        pin();
        greetings();
        transaction();
    }


    public static void transaction() {
        int choice;
        System.out.println("1. Withdraw ");
        System.out.println("2. Deposit");
        System.out.println("3. Balance");
        System.out.println("4. View Transactions");
        System.out.println("---------------------" +
                "Please select an option: " +
                "---------------------");

        choice = in.nextInt();

        switch (choice) {
            case 1:
                float amount;
                System.out.println("Please enter an amount you would like to withdraw.");
                amount = in.nextFloat();
                if (amount > balance || amount == 0) {
                    System.out.println("You have a insufficient with your funds\n\n");
                    anotherTransaction(); // If they want another transaction
                } else {
                    // They have some money
                    // update balance
                    balance = balance - amount;
                    String log = "You have withdrawn " + amount + " and your new balance is now. " + balance;
                    logs.add(log);
                    System.out.println(log);
                    anotherTransaction();
                }
                break;
            case 2:
                // This is to deposit
                float deposit;
                System.out.println("Please enter the amount you would like to put in: ");
                deposit = in.nextFloat();
                // update balance
                balance = deposit + balance;
                String log = "You have deposited " + deposit + " new balance is. " + balance;
                logs.add(log);
                System.out.println(log);
                anotherTransaction();
                break;

            case 3:
                // to balance
                System.out.println("Your balance is " + balance + "\n");
                anotherTransaction();
                break;

            case 4:
                // to view transactions
                for (String transaction : logs) {
                    System.out.println(transaction);
                }
                anotherTransaction();
                break;

        }
    }

    private static void anotherTransaction() {
        System.out.println("Do you want another transaction? \n\nPress 1 for anotherTransaction \n2 To exit.");
        anotherTransaction = in.nextInt();
        if (anotherTransaction == 1) {
            transaction(); // Call method
        } else if (anotherTransaction == 2) {
            System.out.println("Thank you for coming to Atm");
        } else {
            System.out.println("Invalid choice \n\n");
            anotherTransaction();
        }
    }
}
