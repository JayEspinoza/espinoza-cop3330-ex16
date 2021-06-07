/*
 *  UCF COP3330 Summer 2021 Assignment 16 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 16 - Legal Driving Age
 *  Write a program that asks the user for their age and compare it to the legal driving age of sixteen. If the user is sixteen or older, then the program should display
 *  "You are old enough to legally drive." If the user is under sixteen, the program should display "You are not old enough to legally drive."
 *
 *  Constraint:
 *  Use a single output statement.
 *  Use a ternary operator to write this program. If your language doesn’t support a ternary operator, use a regular if/else statement, and still use a single output statement to display the message.
 *
 */

package ex16;
import java.util.Scanner;

public class base {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String [] args)
    {
        // Variable Initialization
        base myBase = new base();
        int age = myBase.getAge();

        // Ternary operator single print statement
        System.out.printf(age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.");

    }

    // Function gets age from user
    public int getAge()
    {
        // User Input
        System.out.printf("What is your age? ");
        int ageIn = userInput.nextInt();
        return ageIn;
    }

}

