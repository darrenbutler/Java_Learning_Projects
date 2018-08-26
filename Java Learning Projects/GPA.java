import java.util.Scanner;

public class GPA{
	public static void main(String[] args){

		double GPA;
		Scanner in = new Scanner (System.in);

		System.out.println("What is your GPA?");
		GPA = in.nextDouble();
		System.out.println("Your GPA is " + GPA + ". Good job!");
	}
}