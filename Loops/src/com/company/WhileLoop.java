package com.company;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean shouldRun = true;

        while (shouldRun){

            System.out.print("Enter Your Command : ");

            String command = scanner.nextLine();

            if (command.equals("Abai jaa") || command.equals("Allah Hafiz")){
                shouldRun = false;
            }
        }

        String[] names = {"Usaid","Abrar","ASA"};
        int arrayIndex = 0;

        while (arrayIndex < names.length){
            System.out.println(names[arrayIndex++]);
        }

    }

}
