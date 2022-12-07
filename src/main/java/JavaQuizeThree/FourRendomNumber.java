package JavaQuizeThree;

import java.util.Random;
import java.util.Scanner;
/**
 * Write a program that generates a random number and asks the user to guess what the number is.
 * If the user's guess is higher than the random number,the program should display "Too high, try again."
 * If the user's guess is lower than the random number, the program should display "Too low, try again."
 * The program should use a loop that repeats until the user correctly guesses the random number.*/

public class FourRendomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // it will generate rendom number from 1 to 10
        //System.out.println("print random number  " + randomNumber);
        while (true) {
            System.out.println("enter your guess (1 to 10) ");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            if (userInput > randomNumber) {
                System.out.println("\"Too high, try again.\"");

            } else if (userInput < randomNumber) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("You guess right. ");
                break;
            }
        }

    }
}
