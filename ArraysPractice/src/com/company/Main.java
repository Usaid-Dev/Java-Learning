package com.company;

public class Main {

    public static void main(String[] args) {

        //without Array
        int myAge = 16;

        //with Array
        int[] friendsAge = {16,25,18,20,35,40};

        friendsAge [0] = 18;
        System.out.println(friendsAge[0]);
        System.out.println(friendsAge[1]);
        System.out.println(friendsAge[2]);
        System.out.println(friendsAge[3]);
        System.out.println(friendsAge[4]);
        System.out.println(friendsAge[5]);

        String[] friendsname = new String[3];
        friendsname [0] = "usaid";
        friendsname [1] = "hamza";
        friendsname [2] = "yaseen";

        System.out.println(friendsname[0]);
        System.out.println(friendsname[1]);
        System.out.println(friendsname[2]);


    }
}
