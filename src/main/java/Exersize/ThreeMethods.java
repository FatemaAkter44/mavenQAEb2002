package Exersize;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeMethods {
    /**
     * Write a Java program that has three methods:
     * getInputFromUser: this method takes 10 integer inputs from a user
     and store them in an array and returns that array.
     * calculateSum: this method calculate sum of all elements of the array and return sum.
     * calculateProduct: this method calculate product of all elements of the array and return product. */
    static int[] array = new int[10];

    public static void main(String[] args) {
        int[] arrayValue=getInputFromUser();
        System.out.println(Arrays.toString(arrayValue));
    }
    public static int[] getInputFromUser(){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("please enter your values: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int calculateSum(){
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum=sum+array[i];

        }
        return sum;
    }
    public static int calculateProduct(){
        int product =0;
        for (int i = 0; i < array.length; i++) {
            product = product*array[i];
        }
        return product;
    }
}
