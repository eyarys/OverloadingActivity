package com.java;

public class App {
    //This method accepts two int parameters to be added
    private static int summation(int num1, int num2){
        return num1 + num2;
    }

    //This method accepts three int parameters to be added
    private static Double summation(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }

    //Create a method that returns the greater of two doubles
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        //Call the greaterValue method with integer parameters
        System.out.println("The greater value between 400 and 43 is " + summation(400,43));

        //Call the greaterValue method with double parameters
        System.out.println("The greater value between 8.2, 6.3, 2.1 is " + summation(8.2,6.3,2.1));

    }
}
