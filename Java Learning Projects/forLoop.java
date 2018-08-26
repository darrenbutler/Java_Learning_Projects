import java.util.Scanner;

public class forLoop{
	public static void main(String[] args) {
		double length;
		double width;
		int rooms;
		double area;


Scanner in = new Scanner (System.in);

System.out.println(" How many room areas do you want to calculate?");
rooms = in.nextInt();


		for (int counter = 0; counter <= rooms ; counter++ ) {
			System.out.println("Input room length in meters.");
			length = in.nextDouble();
			
			System.out.println("Input room width in meters.");
			width = in.nextDouble();
			
			area = length * width;
			System.out.println("The area of room " + counter + " is "  + area + " meters.");
			System.out.println("");

		}
	}
}