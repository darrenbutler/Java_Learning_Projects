public class smallestNumber{
	public static void main(String[] args) {
		
		int number1	= 25;
		int number2 = 37;
		int number3 = 29;

		System.out.println(findSmallest(number1,number2,number3));
	}

	public static int findSmallest (int number1, int number2, int number3){
		int minValue = Math.min(Math.min(number1, number2), number3);
		return minValue;
	}	
}
