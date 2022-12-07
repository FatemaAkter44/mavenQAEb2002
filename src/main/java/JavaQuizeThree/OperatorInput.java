package JavaQuizeThree;

import conditionalStatments.SwitchIfelseWhileLoops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OperatorInput {
    /**Write a program that takes first number, second number and operator(+,-, * , /, %)
     * from user and based on which operator user choose it will print result. (use switch statement)
     * */
    public static void main(String[] args) {
        int firstNumber, secondNumber, result;
        String operator;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter First Number: ");
        firstNumber = scanner.nextInt();

        System.out.println("please enter Second Number: ");
        secondNumber = scanner.nextInt();

        System.out.println("please enter the operator: ");
        operator = scanner.next();

        switch (operator){
            case "+":
                result = firstNumber+secondNumber;
                System.out.println("The result is " + result);
                break;
            case "-":
                result = firstNumber-secondNumber;
                System.out.println("The result is " +result);
                break;
            case "*":
                result = firstNumber*secondNumber;
                System.out.println("The result is " +result);
                break;
            case "/":
                result = firstNumber/secondNumber;
                System.out.println("The result is " +result);
                break;
            case "%":
                result = firstNumber%secondNumber;
                System.out.println("The result is " +result);
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}
