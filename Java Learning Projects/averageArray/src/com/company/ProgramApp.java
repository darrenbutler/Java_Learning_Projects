package com.company;
import java.util.Scanner;
public class ProgramApp {
    Scanner input = new Scanner(System.in);

    void run(){//This method runs the program
        int [] myInteger = getIntegers(5);//Get integers is another method stored in the MyInterger array.

        for (int i = 0; i < myInteger.length; i++){
            System.out.println("Enter number for array");
            myInteger[i] = input.nextInt(); //Moves Position

            System.out.println( "Your number is " + myInteger[i]);
            System.out.println("Element " + i + " typed value is " + myInteger[i]);

        }
        System.out.println("The average is " + calculateAverage(myInteger));
        System.out.println("Your numbers are");
        for (int y = 0; y < myInteger.length; y++){
            System.out.print(myInteger[y] + "," + " ");
        }

    }//Runs the program

    int[] getIntegers(int number){//Must have arguments. Will return array.
        System.out.println("Enter " + number + " integer values. \r" );//Value for number is set in run method
        int[] values = new int[number];//Create array to create list of values. Value number was set to 5 in run method

        for (int i = 0; i < values.length; i++){
        }//End loop

        return values;
    }//Gets intengers in array

    double calculateAverage(int[] array){//Int array will be casted into double
        int sum = 0;
        for (int i = 0; i < array.length; i++ ) {
            sum += array[i];//Adds each value to array
        }
        return (double) sum / (double) array.length;
    }//End calculateAverage
}
