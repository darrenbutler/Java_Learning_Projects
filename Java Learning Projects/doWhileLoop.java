import java.util.Scanner;

public class doWhileLoop{
	public static void main(String[] args) {
		/* */

		Scanner in = new Scanner(System.in);
		double L;
		double W;

		String response = "";

		int count = 0;

		do{
			System.out.println("What is the length of the room?");
			L = in.nextDouble();

			System.out.println("What is the width of the room?");
			W = in.nextDouble();

			System.out.println("The area of the room is" + " " + L*W + " " + "feet.");
			System.out.println(" Would you like to calculate the area of another room? (y/n)");
			response = in.next();
		} while (response.equalsIgnoreCase("y"));
	}
}