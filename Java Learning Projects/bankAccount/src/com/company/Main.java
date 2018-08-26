package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code he
        Scanner input = new Scanner(System.in);



        Account[] accountList = new Account[5];

        int accountListPosition = 0;

        while (accountListPosition < 5){
            accountList[accountListPosition] = new Account();
            System.out.println("What is the customer name?");
            accountList[accountListPosition].setCustomerName(input.next());
            System.out.println("Enter customer phone number");
            accountList[accountListPosition].setPhoneNumber(input.next());
            System.out.println("Enter starting balance:");
            accountList[accountListPosition].setBalance(input.nextFloat());
            System.out.println("Enter email:");
            accountList[accountListPosition].setEmail(input.next());

            accountList[accountListPosition].setAccountNumber(Double.toString(100+ accountListPosition));

            System.out.println("Account details:");
            System.out.println("-----------------------------------------------------");
            System.out.println("Name: " + accountList[accountListPosition].getCustomerName());
            System.out.println("Account number: " + accountList[accountListPosition].getAccountNumber());
            System.out.println("Phone number: " +  accountList[accountListPosition].getPhoneNumber());
            System.out.println("Email: " + accountList[accountListPosition].getEmail());
            System.out.println("Balance: "  + accountList[accountListPosition].getBalance());
            System.out.println("-----------------------------------------------------");


            ///Finish inforation to be printed out


            accountListPosition = accountListPosition + 1;
        }

        Account bruceWayne = new Account();
        bruceWayne.setAccountNumber("789456123");
        bruceWayne.setBalance(100000000);
        bruceWayne.setCustomerName("Bruce Wanyne ");
        bruceWayne.setEmail("notbatman@gmail.com");
        bruceWayne.setPhoneNumber("789-4561");

        System.out.println("Account details:");
        System.out.println(bruceWayne.getCustomerName());
        System.out.println( bruceWayne.getAccountNumber());
        System.out.println(bruceWayne.getBalance());
        System.out.println(bruceWayne.getEmail());
        System.out.println(bruceWayne.getPhoneNumber());
    }
}
