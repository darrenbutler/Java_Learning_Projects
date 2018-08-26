import java.util.Scanner;
public class contact2 {
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
		String printMessage;
                printMessage = "Your name is " + name + ". Your age is " + age 
                      + ". Your number is " + phoneNumber;
            
                return printMessage;
                
                
	}
    
}