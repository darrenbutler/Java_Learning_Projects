import java.util.Scanner;
public class contact{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		String name;
		String age;
		String phoneNumber;

		System.out.println("What is your name?");
		name = in.next();

		System.out.println("What is your age?");
		age = in.next();

		System.out.println("What is your phone number?");
		phoneNumber = in.next(); 

		System.out.println(message(name, age, phoneNumber));
	}

	public static String message(String name, String age, String phoneNumber){
		System.out.println("Your name is " + name);
		System.out.println("Your age is " + age);
		System.out.println("Your number is " + phoneNumber);

	}
}