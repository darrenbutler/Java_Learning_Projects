package com.company;

public class Main {

    public static void main(String[] args) {
	/* Increment*/
	int a = 1;
	a+= 1; //Increments

    //Char
        char letter = 'a';
        a+= 1; // Would print b

    //CONVERSION
        int letters = 500;

        char newLetter = (char) letter;//Would print corresponding character for number
        System.out.println(newLetter);

        //Casting:
        byte age = 127;
        int earthAge = 30000;
        byte newAge = (byte) earthAge;//New type has to bee on both sides
        System.out.println(newAge);//Would print negative number because of overflow

        System.out.println("Print a to z");
        //Looping through char
        for (char loopChar = 'a'; loopChar <= 'z'; loopChar++){
            System.out.print(loopChar);
        }

        for (int counter = 0; counter < 1001; counter++){
            char convertedLetter = (char) counter;//Converts the int to char
            System.out.print(convertedLetter);
            if (counter == 30){
                System.out.println("");
            }
        }



    }
}
