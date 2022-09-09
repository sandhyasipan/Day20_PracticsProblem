package com.bridgelabs;

import java.util.Scanner;

public class SpecialChar {
    public static void main(String[] args) {
        System.out.println("Enter the Password with Special character :-");
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        String regularExp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*_-]).{8,}$";

        if (password.matches(regularExp)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
}
