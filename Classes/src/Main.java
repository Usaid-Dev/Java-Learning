/*
 * Object oriented Programming (OOP)
 * Ye objects par base krti hai
 * Har object mai 2 parts hotai hain
 * 1. Properties (Variables)
 * 2. Behaviours (Functions/Methods)
 *
 * Core Concepts of OOP
 *
 * Inheritance
 * Abstraction
 * Polymorphism
 * Encapsulation
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Shop shop;
    private static Scanner in;

    private static void Welcome() {
        System.out.println(" Welcome to Iphone shop ");
        System.out.println("------------------------");
        System.out.println(" Select these options ");
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        shop = new Shop();
        Welcome();
        Selection();
    }


    public static void Selection() {

        int choice;

        System.out.println("0. For exit the Shop ");
        System.out.println("1. For buy a Iphone ");
        System.out.println("2. For list ");
        System.out.println("3. For Exchange ");
        System.out.println("---------------------" +
                "Please select an option: " +
                "---------------------");

        choice = in.nextInt();

        switch (choice) {

            case 0:
                System.out.println(" Thanks for coming to the shop ");
                return;
            case 1:
                System.out.println(" Enter your name ");
                in.nextLine();
                String name = in.nextLine();
                System.out.println(" Enter your Age ");
                int age = in.nextInt();
                if (age < 18) {
                    System.out.println(" Only 18+ can buy phone from here");
                    return;
                }
                System.out.println(" Enter your Cnic ");
                int cnic = in.nextInt();

                Buyer buyer = new Buyer(name,age,cnic);

                System.out.println(" Enter your Iphone model here and Please enter full name of your Iphone ");
                System.out.println(" ------------------------------$$-------------------------------------- ");
                in.nextLine();
                String model = in.nextLine();
                iPhone iPhone = new iPhone(model);

                buyer.buy(iPhone);

                System.out.println("Have a good day...!");

                shop.addBuyer(buyer);
                break;

            case 2:
                shop.listBuyers();
                break;

            case 3:
                in.nextLine();
                System.out.println(" Enter your name ");
                String buyerName = in.nextLine();
                int indexOfBuyer = shop.buyers.indexOf(new Buyer(buyerName,0,0));
                Buyer oldBuyer = shop.buyers.get(indexOfBuyer);

                System.out.println(" Enter your Iphone model ");
                String type = in.nextLine();
                iPhone apple = new iPhone(type);
                oldBuyer.exchange(apple);
                break;

        }

        System.out.println("  ");
        Selection();
    }
}