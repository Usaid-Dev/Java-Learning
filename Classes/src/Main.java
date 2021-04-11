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

/*
 * TASK
 * Make output something like this
 * ==================WELCOME to Mobile SHAP ==================
 * 1. Buy an iPhone
 * 2. List Sales
 * 3. KICK ASS
 * */


import java.util.Scanner;

public class Main {
    static Shop shop;
    private static Scanner in;

    private static void Welcome() {
        System.out.println(" Welcome to Mobile Shop ");
        System.out.println(" Select these options ");
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        shop = new Shop();
        Welcome();
        Selection ();
    }

    public static void Selection() {

        int choice;

        System.out.println("0. For exit the Shop ");
        System.out.println("1. For buy a phone ");
        System.out.println("2. For Exchanging a phone ");
        System.out.println("---------------------" +
                "Please select an option: " +
                "---------------------");

        choice = in.nextInt();

        switch (choice) {
            case 1:

                break;

        }
    }
}