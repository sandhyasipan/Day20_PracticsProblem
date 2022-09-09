package com.bridgelabs;

import java.util.Scanner;

public class Emailcheck {
    public static void main(String[] args) {
        System.out.println("Enter the Valid Email:- ");
        Scanner scan = new Scanner(System.in);
        String emailCheck = scan.nextLine();

        String regularExp = "^[a-zA-Z]{3}.?[a-zA-z]{0,3}@[a-zA-Z]{2}.[a-zA-Z]{2}.?[a-zA-Z]{0,2}$";

        if (emailCheck.matches(emailCheck)) {
            System.out.println(" This is a Valid Email");
        } else {
            System.out.println("This is a Invalid Email");
        }
    }
}
