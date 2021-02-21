package com.company;

public class Operators {
    public static void main(String[] args) {
        // = is assignment operator
        int a = 10;
        int b = 3;

        //Arithmetic operators +,-,*,/,%
        int plus = a+b;
        int minus = a-b;
        int multiply = a*b;
        float divide = (float)a/b;
        int modulus = a%b;

        //Comparison Operators >,<,>=,<=,!=,==
        boolean greater = a > b;
        boolean less = a < b;
        boolean greaterEqual = a >= b;
        boolean lessEqual = a <= b;
        boolean notEqual = a != b;
        boolean equal = a == b;

        //Logical Operators &&,||
        boolean or = a > b || a < b;
        boolean and = a > b && a < b;

        // Increment operators ++
        // Post
        int c = a++;
        // Pre
        int d = ++a;
        System.out.println(c);
        System.out.println(d++);
        System.out.println(a);
    }
}
