package com.pluralsight;

import java.util.Scanner;

public class sandwichShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Start of sandwich question
        System.out.println("Which sandwich are you choosing. \n 1:Regular 2:Large");
        int size = scan.nextInt();

        if (size == 1){
            System.out.println("You chosen the regular. The base price is $5.45.");
        }
        else if (size == 2) {
            System.out.println("You chosen the large. The base price is $8.95.");
        }
        else {
            System.out.println("Invalid answer.");
        }
        //End of sandwich question

        //Start of the age question
        System.out.println("How old are you?");
        int age = scan.nextInt();

        if (age <= 17){
            System.out.println("You will receive a 10% discount.");
        }
        else if (age >= 65){
            System.out.println("You will receive a 20% discount");
        }
        else {
            System.out.println("You don't receive no discount");
        }
        //End of age question
    }
}
