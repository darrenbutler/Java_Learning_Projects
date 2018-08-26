/*This program uses decision logic to determine shipping cost
 *shipping rates:
 *Less than $25 cost is $15
 *Between $50 and $75 the cost is $5
 *Over $35 but less than 50 is 10
 *Over $75 free.
 */
package com.company;

import java.util.Scanner;

public class Main {
    public static void homeWork(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is the length of the item?: ");
        double length = in.nextDouble();

        System.out.print("What is the width of the item?: ");
        double width = in.nextDouble();

        System.out.print("What is the height of the box?: ");
        double height = in.nextDouble();

        Calculate(length, height, width, 0.075);
    }

    static void Calculate(double length, double height, double width, final double _VAT) {
        double volume = length * width * height;
        double VatPrice = volume * _VAT;
        double totalPrice = VatPrice + volume;
        double shippingFee = volume;

        if (shippingFee > 25) {
            shippingFee = shippingFee + 15;
        } else if ((shippingFee > 50) && (shippingFee < 75)){
            totalPrice = shippingFee + 5;
        } else  if((shippingFee > 30 ) && (shippingFee < 75))
            shippingFee = shippingFee + 10;
        else {
            shippingFee = shippingFee + 0;
        }
        System.out.printf("Vat $%2.2f",VatPrice);
        System.out.printf("\nYour charge is $%2.2f",shippingFee);
        System.out.printf("\nYour total is $%2.2f",totalPrice + shippingFee);
}
}