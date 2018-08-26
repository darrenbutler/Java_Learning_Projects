import java.util.Scanner;
public class simpleInterest{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		double principle;
		double rate;
		double time;

		System.out.println("What is the principle?");
		principle = in.nextDouble();

		System.out.println("What is the rate (as decimal)?");
		rate = in.nextDouble();

		System.out.println("What is time (in years)? ");
		time = in.nextDouble();

		System.out.println( "The interest is " + " $ " + Calculate(principle, rate, time) );

	} 
	public static double Calculate (double principle, double rate, double time){
		double interest = (principle*rate*time);

		return interest;
	}
}