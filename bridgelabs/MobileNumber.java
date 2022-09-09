package com.bridgelabs;

import java.util.Scanner;

public class MobileNumber {
    public static void main(String[] args) {
        System.out.println("Enter The Mobile Number:-");
        Scanner scan = new Scanner(System.in);
        String mobile = scan.nextLine();

        String regularExp = "^[0-9]{2}\\s[0-9]{10}$";

        if (mobile.matches(regularExp)) {
            System.out.println("Valid Mobile Number ");
        } else {
            System.out.println("Invalid Mobile Number");
        }
    }
}
