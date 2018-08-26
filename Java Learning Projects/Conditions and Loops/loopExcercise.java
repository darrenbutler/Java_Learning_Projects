

public class loopExcercise {
	public static void main(String[] args) {


		for(int lines = 1; lines < 8; lines = lines + 1){
			int dotsPrinted = 7;

			for(int dotsInLine = dotsPrinted; dotsInLine > 0; dotsInLine = dotsInLine -1){

				System.out.print(".");
			}
			dotsPrinted = dotsPrinted - 1;
			System.out.println(" ");


		}

		
	}
}