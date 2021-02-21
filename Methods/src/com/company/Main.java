package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
	    menu();
    }

    static void menu(){

        System.out.println("====MENU====");
        //for table
        System.out.println("Knsa table jani?");
        int forTable = scanner.nextInt();
        System.out.print("Kaha Tak jani?");
        int lambai = scanner.nextInt();
        seedhaTable(forTable,lambai);
        System.out.println("Seedha to chala dia yar!");
        System.out.print("Ab Kia ulta chalau ajeeb?");
        scanner.nextLine();
        if(scanner.nextLine().equals("Han")){
            ultaTable(forTable,lambai);
            System.out.println("Ye lai!");
        }
    }

    static void ultaTable(int knsaTable,int kahaTakJani){
        for (int tableNumber = kahaTakJani; tableNumber >= 1; tableNumber--) {
            //2 X 1 = 2
            System.out.println(knsaTable + " X " + tableNumber + " = " + (knsaTable * tableNumber));
        }
    }

    static void seedhaTable(int knsaTable,int kahaTakJani){
        for (int tableNumber = 1; tableNumber <= kahaTakJani; tableNumber++) {
            //2 X 1 = 2
            System.out.println(knsaTable + " X " + tableNumber + " = " + (knsaTable * tableNumber));
        }
    }
}
