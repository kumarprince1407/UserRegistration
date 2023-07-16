package com.bridgelabz.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public void validFirstName() {

        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First name: ");
        String firstName = sc.nextLine();

        Matcher matcher =pattern.matcher(firstName);
        if(matcher.matches()){
            System.out.println("First name is valid.");
        }else{
            System.out.println("Pattern is not valid");
        }
    }
    public void validLastName() {

        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Last name: ");
        String lastName = sc.nextLine();

        Matcher matcher =pattern.matcher(lastName);
        if(matcher.matches()){
            System.out.println("Last name is valid.");
        }else{
            System.out.println("Pattern is not valid");
        }
    }
    public void validEmail() {

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+\\.[a-z]{2,}$");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String keyName = sc.nextLine();

        Matcher matcher =pattern.matcher(keyName);
        if(matcher.matches()){
            System.out.println("Entered email is valid.");
        }else{
            System.out.println("Entered email is not valid");

        }
    }
    public void validMobileNumber() {

        Pattern pattern = Pattern.compile("^[9][1]\\s[6-9][0-9]{9}$");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Mobile number: ");
        String mobile = sc.nextLine();

        Matcher matcher =pattern.matcher(mobile);
        if(matcher.matches()){
            System.out.println("Mobile number is valid.");
        }else{
            System.out.println("Mobile number is not valid");

        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to user registration program.");
        UserRegistration ur = new UserRegistration();
        ur.validFirstName();
        ur.validLastName();
        ur.validEmail();

        ur.validMobileNumber();

    }
}
