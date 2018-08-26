import java.util.Scanner;

public class aboutMe {
	public static void main (String [] args){

		String myName;
		Scanner in = new Scanner(System.in);

		System.out.println("What is my name?");
		myName = in.next();
		System.out.println("Hello " + myName);

		
	}
}