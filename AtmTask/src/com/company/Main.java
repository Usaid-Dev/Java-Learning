package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner;
    static int marks;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        pin();
    }

    public static void pin(){

        System.out.println("Enter Your Pin Code");
        int input = scanner.nextInt();
        if (input == 1234) {
            menu();
        }
        else{
            System.out.println("Invalid.. Please Try Again");
            pin();
        }

    }

    public static void menu() {
        menuItem(1, "add");
        menuItem(2, "subtract");
        menuItem(3, "view");
        menuItem(0, "exit");
        int selection = scanner.nextInt();
        if (selection == 0 || selection == 3) {
            System.out.println("Final Marks are : " + marks);
            if (selection == 0) {
                return;
            } else {
                menu();
                return;
            }
        }
        System.out.print("Enter marks : ");
        int marksInput = scanner.nextInt();
        switch (selection) {
            case 1:
                marks += marksInput;
                break;
            case 2:
                marks -= marksInput;
                break;
            default:
                System.out.println("Invalid option selected");
        }
        menu();
    }

    public static void menuItem(int optionSelector, String name) {
        System.out.println(optionSelector + " to " + name + " marks");
    }
}
