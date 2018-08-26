import java.util.Scanner;
public class horrorscope{
	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to your horrorscope!");

		System.out.println("What month are you born in?");
		String month = in.next();

		System.out.println("What day of the month were you born on?");
		int day = in.nextInt();

		switch(month.toLowerCase()){ //Beginning of Switch
			case "january":
				if (day >= 20) { //Start if statement for day in January
					System.out.println("You are a Aquarius");
					System.out.println("You will die today. Too bad.");
				} else {
					System.out.println("You are a Capricorn.");
					System.out.println("You will die today. Sorry.");
				}//End if statement for day in January	
			break;

			case "february":
				if (day >= 19) { //Start if statement for day in february
					System.out.println("You are a pisces");
					System.out.println("You will have a good day! :)");
				} else{
					System.out.println("You are an Aquarius.");
					System.out.println("You will die today. Sorry.");
				}//End if statement for day in February
			break;

			case "march":
				if (day > 20) {//Start if for day in march
					System.out.println("You are an Aries.");
					System.out.println("You will die today. Sorry.");
				}else{
					System.out.println("You are a pisces.");
					System.out.println("You will have a good day.");
				}//End IF for day in march
				break;

			case "april":
				if (day >19) {//Start if for day in april
					System.out.println("You are a Taurus.");
					System.out.println("You will die today.");
				}else{
					System.out.println("You are are an Aries");
					System.out.println("You will die today.");
				}//End if for day in april
			break;

			case "may":
				System.out.println("Your horrorscope says:");
				System.out.println("You will die today. Sorry.");
			break;

			case "june":
				System.out.println("Your horrorscope says:");
				System.out.println("You will die today. Sorry.");
			break;

			case "july":
				System.out.println("Your horrorscope says:");
				System.out.println("You will die today. Sorry.");
			break;

			case "august":
				System.out.println("Your horrorscope says:");
				System.out.println("You will die today. Sorry.");
			break;

			case "septemeber":
				System.out.println("Your horrorscope says:");
				System.out.println("You will die today. Sorry.");
			break;

			case "october":
				System.out.println("Your horrorscope says:");
				System.out.println("You will die today. Sorry.");
			break;

			case "november":
				System.out.println("Your horrorscope says:");
				System.out.println("You will die today. Sorry.");
			break;

			case "december":
				System.out.println("Your horrorscope says:");
				System.out.println("You will die today. Sorry.");
			break;


		}//End of Switch

		
	}//End of Main Method

}//End of horrorscope class