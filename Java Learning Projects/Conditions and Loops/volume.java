import java.util.Scanner;
public class volume{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		//VOLUME CALCULATOR 
			System.out.println("Input length.");
			double L = in.nextDouble();

			System.out.println("Input width.");
			double W = in.nextDouble();

			System.out.println("Input height.");
			double H = in.nextDouble();

			double volume = L*W*H;
			System.out.println("The volume is " + volume + " liters");

		//PRICING AND TAX

			// $2.00 per cubic meter
			
			double VAT = 0.075 * volume;
			double totalPrice = volume + VAT;
			
			

			System.out.printf("Your total is $%2.2f", totalPrice);



		

		
	}
}