package com.bridgelabs;

import java.util.Scanner;

public class NumberPassword {
    public static void main(String[] args) {
        System.out.println("Enter the 8 Digit Password along with :-");
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        String regularExp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8}$";

        if (password.matches(regularExp)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
