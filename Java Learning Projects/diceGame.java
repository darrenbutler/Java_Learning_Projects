/*Objective - to get a total of 7 or 11. If you get 5 and 2 you have 
to take the person's dollar and bet again. If you get 4 and 3 you get everything.
You have 3 rolls. If you do not get a 7 in 3 rolls your turn is over  */

import java.util.Scanner;

public class diceGame{

	public static void main(String[] args){

		int dice1 = 0;
		int dice2 = 0;
		int total = dice1 + dice2;

		//For user to start and roll
		String start;
		Scanner in = new Scanner(System.in);

		System.out.println("Start game? (Yes) (No)");
		start = in.next(); 

		switch(start) {
			case "Yes":
				//Loop for 3 turns
				for (int turns = 3; turns > 0; turns = turns- 1)  {
				dice1 = (int) (Math.random()*6+1);
				dice2 = (int) (Math.random()*6+1);

				if (total == 7) {
					if (dice1 == 5 && dice1 == 2 ||  dice1 == 2 && dice2 == 5) {
						System.out.println("You rolled " + dice1 + " and " + dice2 + ". Take a dollar");

					} else{
						System.out.println( "You rolled 4 and 3. Take it all!");
					}
				} else if (total == 11 ) {
					System.out.println(" You rolled " + dice1 + " and " + dice2);
					System.out.println("Take it all!");
					
				} else {
					System.out.println("You rolled " + dice1 + " and " + dice2);
					System.out.println("You get nothing. Try again.");
				}

				
					//Shows rolls left
					System.out.println("You have " + turns + " turns left." );

					}

					System.out.println("You have no more turns.");
			break;

			default:
			System.out.println("Afraid you might lose? Come back when you're ready.");
			break; 
			}		

	}
}

/*
System.out.println(dice1);
System.out.println(dice2);

//Adding values
System.out.println(dice1 + dice2);

//Showing both numbers
System.out.println(dice1 + " and " + dice2);

//If there is a double.
System.out.println(dice1 + " " + dice2);

if (dice1==dice2) {
	System.out.println("Double!");
} else {
	System.out.println("No double. Try again!");
}*/
