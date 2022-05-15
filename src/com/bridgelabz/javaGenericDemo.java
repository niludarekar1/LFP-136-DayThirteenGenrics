package com.bridgelabz;

public class javaGenericDemo {
    //compareTo method for Checking Maximum from 3 Integer Object
    public static Integer compareTo(Integer a,Integer b,Integer c) {
        if(a > b){
            if(a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        //Welcome message for User
        System.out.println("Welcome to Java Core - Generics Test Maximum Developed by Nilesh Darekar.");

        System.out.println("Maximum from 3 Integer Object : "+compareTo(90,120,20));
    }
}