package JavaQuizeThree;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeMethods {
    /**
     * Write a Java program that has three methods:
     * getInputFromUser: this method takes 10 integer inputs from a user
     and store them in an array and returns that array.
     * calculateSum: this method calculate sum of all elements of the array and return sum.
     * calculateProduct: this method calculate product of all elements of the array and return product. */

    int[] array = new int[10];

    public int[] getInputFromUser(){
    int n = 10;

    Scanner scanner = new Scanner(System.in);
    for (int index = 0; index<n; index++){
        System.out.println("please enter your number: ");
        array[index] = scanner.nextInt();
    }
  /* for (int element: array){
       System.out.println(element);
   }*/
return array;
}
//* calculateSum: this method calculate sum of all elements of the array and return sum.
    public int calculateSum(){
    int sum=0;
    for (int index = 0; index<array.length; index++){
        sum=sum+array[index];
    }
    return sum;
    }
    //calculateProduct: this method calculate product of all elements of the array and return product.
    public int calculateProduct(){
        int product =0;
        for (int index = 0; index<array.length; index++){
            product = product*array[index];
        }
        return product;
    }

    public static void main(String[] args) {
        ThreeMethods twoHaveThreeMethods = new ThreeMethods();
        int[] arrayValue = twoHaveThreeMethods.getInputFromUser();
        System.out.println(Arrays.toString(arrayValue));
        System.out.println("cauculet some of the array: " + twoHaveThreeMethods.calculateSum());
        System.out.println("calculate product of array: "+ twoHaveThreeMethods.calculateProduct());
    }

}