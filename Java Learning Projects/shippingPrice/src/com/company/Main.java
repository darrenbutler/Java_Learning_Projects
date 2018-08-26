package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //VOLUME CALCULATOR
        double L;
        double W;
        double H;
        System.out.println("Input length.");
        L = in.nextDouble();

        System.out.println("Input width.");
        W = in.nextDouble();

        System.out.println("Input height.");
        H = in.nextDouble();
        //Store values in arguments
        double volume = 0;
        double Vat = 0;
        double totalPrice =0;

        //PRICING AND TAX

        // $2.00 per cubic meter

        //PRICING AND TAX

        // $2.00 per cubic meter

        calculate(L, W, H, volume, Vat, totalPrice);

    }

    public static void calculate (double L, double W, double H, double volume, double Vat, double totalPrice){

        volume = L*W*H;
        System.out.println("The volume is " + volume + " liters");
        Vat = 0.075 * volume;
        totalPrice = volume + Vat;
        System.out.printf("Your total is $%2.2f", totalPrice);

    }
}
