package JavaQuizeThree;

import java.util.Scanner;

public class Numbers {
    /**
     * Write a do-while loop that asks the user to enter two numbers.
     * The numbers should be added and the sum displayed.
     * The loop should ask the user whether he or she wishes to perform the operation again.
     * If so, the loop should repeat; otherwise it should terminate
    **/
    public static void main(String[] args) {
        String userChoice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter first number: ");
            int numberOne = scanner.nextInt();
            System.out.println("Enter 2nd number: ");
            int secondNumber = scanner.nextInt();

            int sum = numberOne+secondNumber;
            System.out.println("sum: " + sum);

            System.out.println("Do you wishes to perform the operation again? Enter y for yes, n for no");
            userChoice = scanner.next();

        }while (userChoice == "y");
    }
}
