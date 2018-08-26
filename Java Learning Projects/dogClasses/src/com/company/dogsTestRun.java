package com.company;

import java.util.Scanner;

public class dogsTestRun {
    public static void main(String[] args) { //MAIN METHOD
        Scanner in = new Scanner(System.in); //Scanner object

        System.out.println("How many dogs do you want?");
        int numberOfDogs = in.nextInt();
        int dogListLength = numberOfDogs;


        /// Use array to make a list of dog objects

        //Specifies the length of array
        dogs[] myDogs = new dogs[dogListLength];

        // Dog list position
        int dogsListPosition = 0; //Starts from first position

        while(dogsListPosition<dogListLength){
        myDogs[dogsListPosition] = new pitbull();
        System.out.println("What is your new dogs name?");
        myDogs[dogsListPosition].setName(in.next());
        System.out.println("Your new dogs name is " + myDogs[dogsListPosition].getName());
        System.out.println("This is dog number " + (dogsListPosition + 1));

        //Increment
        dogsListPosition = dogsListPosition + 1;
    }//End While Loop

        // Goes through each position in array and prints value
        for( dogs dog: myDogs){ // class referenceName: arrayName
            System.out.println(dog.getName());
            System.out.println("What is your dog's age?");
            dog.setAge(3);
            System.out.println("Your dog's age is " + dog.getAge());
            dogsListPosition++;
        }


    }
    }//End Main method

