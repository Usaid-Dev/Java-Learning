package com.company;

public class Main {

    public static void main(String[] args) {

        // For Loop
        String[] friends = {
                "Usaid", "Abrar", "Asaad", "Arsalan", "Hamza"
        };

        for (int loopVar = 0; loopVar < friends.length; loopVar++) {
            System.out.println(friends[loopVar]);
        }

        //for table
        int table = 8;
        int tableLength = 10;

        for (int tableNumber = tableLength; tableNumber >= 1; tableNumber--) {
            //2 X 1 = 2
            System.out.println(table + " X " + tableNumber + " = " + (table * tableNumber));
        }
        System.out.println("=======");
        for (int tableNumber = 1; tableNumber <= tableLength; tableNumber++) {
            //2 X 1 = 2
            System.out.println(table + " X " + tableNumber + " = " + (table * tableNumber));
        }


        // while loop
        String[] names = {"Usaid", "Abrar", "ASA"};
        int arrayIndex = 0;

        while (arrayIndex < names.length) {
            System.out.println(names[arrayIndex++]);
        }


    }
}
