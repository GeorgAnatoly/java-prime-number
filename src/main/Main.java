package main;

import validation.StringValidation;

import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        System.out.println("-- Prime Number Series Generator --");
        System.out.println();

        var scanner = new Scanner(System.in);
        String userInput;

        var stringValidation = new StringValidation();

        do {
            System.out.println("Generate the list of primes up to a number.");
            System.out.println("Enter a number between 1 and 1000:");

            userInput = scanner.next();

        }while (!stringValidation.isNumber(userInput));

        var userNumber = Integer.valueOf(userInput);

        while(userNumber < 1 || userNumber > 1000){
            System.out.println("Number must be between 1 and 1000:");
            userInput = scanner.next();

            userNumber = Integer.valueOf(userInput);
        }

        System.out.println(userInput);
    }
}
