package JavaQuizeThree;

import java.util.Scanner;

public class Temperature {
    /**
     * Write a Java program to convert the temperature in Degree Centigrade to Fahrenheit.
     * (Explain your logic in the comments)*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //this line take userinput
        System.out.println("please enter temprature in Degree Centigrade : ");
        int userinput = scanner.nextInt(); //this line take userinput
        //°F = (°C x 1.8) + 32.
        int fahrenheight = (int) ((userinput * 1.8) + 32); //this is the formula to convert tempetature. I use casting because i am multiplying with a float number.
        System.out.println("Temperature " + userinput + " Degree Centigrade is equeal to "+
                fahrenheight+ " Fahrenheit");
    }
}
