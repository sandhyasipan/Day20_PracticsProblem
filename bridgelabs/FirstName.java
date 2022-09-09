package com.bridgelabs;

import java.util.Scanner;

public class FirstName {
    public static void main(String[] args) {
        System.out.println("Enter the firstName:- ");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();

        String regularExp = "^[A-Z]{1}[A-Za-z]{2}$";

        if (firstName.matches(regularExp)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
