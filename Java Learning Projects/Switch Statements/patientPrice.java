import java.util.Scanner;
public class patientPrice{
	public static void main(String[] args) { //Beginning of Main method
		Scanner in = new Scanner(System.in);

 		int runs = 0;
 		do{ // Start Loop for whole program
 			

	 		System.out.println("What is the cost of the overnight stay?");
				double overnightStayPrice = in.nextDouble();
			System.out.println("What is the cost of the medication?");
				double medicationPrice = in.nextDouble();
			System.out.println(" What is the price of service?");
				double servicePrice = in.nextDouble();

			System.out.println("The total price is:");
			System.out.println(calculatePrice(overnightStayPrice,medicationPrice, servicePrice));
			
			int askAgain = 0; //Counter for asking to calculate again

			do {
				

				System.out.println("Do you wish to calculate the price again? Yes or no? ");
				String again = in.next();

				//Checking input 
				switch(again.toLowerCase()){
				case "yes": 
						
				break;
				case "no":
						System.out.println("Thank you. Come again.");
						runs = runs+ 1;
				break;
				default:
				System.out.println("Please answer properly.");
				askAgain = askAgain +1;
				break;

			} //End of Switch 
			/////////////////////////
			} while(askAgain == 1); //End loop for asking to calculate again


 		} while(runs==0); //End loop for whole program
		
	}

	public static double calculatePrice(double overnightStayPrice, double medicationPrice, double servicePrice){
		double totalPrice = overnightStayPrice + medicationPrice + servicePrice;
		return totalPrice;
	}


}