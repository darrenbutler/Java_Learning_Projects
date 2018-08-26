import java.util.Scanner;

public class myAge{
	public static void main(String[] args){

		int myAge;
		Scanner in = new Scanner (System.in);

		System.out.println("What is your age?");
		myAge = in.nextInt();
		System.out.println("You are " + myAge + " years old.");
	}
}