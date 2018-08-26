package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scannner(System.in);
	double price = 5.00;
	System.out.println("The price of a breast snack was " + price);

	for (double i = 1; i < 46; i++){
	    System.out.printf("The new price pf a breast snack is %2.2f"/n (calculateInt(amount: 5, i) + price));

    }
    }
    public static double calculateInt(double amount, double interestRate){ //Arguments declared
        return (amount* (interestRate/100));
    }


}
