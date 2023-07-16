package com.bridgelabz.user_registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public void validFirstName() {
        System.out.println("Welcome to user registration program.");
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First name ");
        String firstName = sc.nextLine();

        Matcher matcher =pattern.matcher(firstName);
        if(matcher.matches()){
            System.out.println("First name is valid.");
        }else{
            System.out.println("Pattern is not valid");
        }
    }
    public void validLastName() {
        System.out.println("Welcome to user registration program.");
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Last name ");
        String firstName = sc.nextLine();

        Matcher matcher =pattern.matcher(firstName);
        if(matcher.matches()){
            System.out.println("Last name is valid.");
        }else{
            System.out.println("Pattern is not valid");
        }
    }
    public void validEmail() {

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+\\.[a-z]{2,}$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String firstName = sc.nextLine();

        Matcher matcher =pattern.matcher(firstName);
        if(matcher.matches()){
            System.out.println("Entered email is valid.");
        }else{
            System.out.println("Entered email is not valid");
        }
    }
    public static void main(String[] args) {
        UserRegistration ur = new UserRegistration();
        ur.validFirstName();
        ur.validLastName();
        ur.validEmail();
    }
}
