import java.util.Scanner;

public class combined{
	public static void main(String[] args){

		double GPA;
		int myAge;
		String myName;

		Scanner in = new Scanner (System.in);

		System.out.println("What is your name?");
		myName = in.next();

		System.out.println("What is your age?");
		myAge = in.nextInt();

		System.out.println("What is your GPA?");
		GPA = in.nextDouble();
		
		System.out.println("Your name is " + myName + ".");
		System.out.print(" You are " + myAge + " years old.");
		System.out.print(" Your GPA is " + GPA + ". Good job!");
	}
}