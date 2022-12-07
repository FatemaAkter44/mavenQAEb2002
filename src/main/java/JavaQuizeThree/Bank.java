package JavaQuizeThree;

import java.util.Scanner;

public class Bank {
    /**
     * Create a class "Bank" with instance variables and methods:
     * firstName
     * lastName
     * address
     * phone
     * account number
     * balance
     * createAccount(): This method will set values for all instance
     variables after taking input from user and set value for balance to 0.
     * addBalance(): This method will will take balance as input from user
     and display the message "You are getting rich day by day". */

    String firstName;
    String lastName;
    String address;
    long phone;
    long accountNumber;
    float balance;
    Scanner scanner = new Scanner(System.in);

    public  void createAccount(){
        System.out.println("Please enter your first name: ");
        firstName = scanner.next();
        System.out.println("Please enter your last name: ");
        lastName = scanner.next();
        System.out.println("Please enter your address: ");
        //address = scanner.next();
        address=scanner.next();
        System.out.println("Please enter your phone number: ");
        phone = scanner.nextLong();
        System.out.println("Please enter your account number: ");
        accountNumber = scanner.nextLong();
        balance =0;
    }
   public void addBalance(){
       System.out.println("please enter your balance: ");
       balance = scanner.nextFloat();
       System.out.println("you are getting rich day by day.");
   }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount();
        bank.addBalance();
    }

}
