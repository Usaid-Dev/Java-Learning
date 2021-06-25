package com.company;

public class Main {

    public static void main(String[] args) {
        // Without Array
	    int myAge = 16;

	    //With Array
	    int[] friendsAge = {16,25,23,45};

	    // For changing array data
	    friendsAge[0] = 17;
        System.out.println(friendsAge[0]);
        System.out.println(friendsAge[1]);
        System.out.println(friendsAge[2]);
        System.out.println(friendsAge[3]);

        String[] friendsNames = new String[3];
        friendsNames [0] = "Usaid";
        friendsNames [1] = "Abrar";
        friendsNames [2] = "Assad";

        friendsNames[0] = "Ishaq";

        System.out.println(friendsNames[0]);
        System.out.println(friendsNames[1]);
        System.out.println(friendsNames[2]);
    }
}
