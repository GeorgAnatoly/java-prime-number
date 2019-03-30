package main;

import stringformating.FormatString;
import validation.NumberValidation;
import validation.StringValidation;

import java.util.ArrayList;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        System.out.println("-- Prime Number Series Generator --");
        System.out.println();

        var scanner = new Scanner(System.in);
        String userInput;

        var stringValidation = new StringValidation();

        System.out.println("Generate the list of primes up to a number.");
        System.out.println("Enter a number between 1 and 1000:");

        userInput = scanner.next();

        while(stringValidation.isNotNumber(userInput)) {
            System.out.println("Entered value may only be numerical.");

            userInput = scanner.next();
        }

        var numberValidation = new NumberValidation();
        int userNumber = Integer.valueOf(userInput);

        while(numberValidation.isNotInRange(1, 1000, userNumber)){
            System.out.println("Number must be between 1 and 1000:");
            userInput = scanner.next();

            userNumber = Integer.valueOf(userInput);
        }

        var primeList = new ArrayList<Integer>();

        for(var number = 1; number <= userNumber; ++number) {
            if(numberValidation.isPrime(number))
                primeList.add(number);
        }

        var formatString = new FormatString();

        var output = formatString.numberSingleSpacePattern(primeList);

        System.out.println(output);
    }
}
