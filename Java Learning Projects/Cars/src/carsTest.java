import java.util.Scanner;
public class carsTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You have 5 cars. Set the specs!");

        cars[] carList = new cars[5];



        //NEW object made with constructor
        cars Ford = new cars("Explorer", 4, "Dunno", 4, "blue");

        Ford.aboutCar();
        for(cars car: carList){ // class referenceName: arrayName
            System.out.println("What is the Model?");
            car.setModel(userInput.next());
            System.out.println("How many wheels?");
            car.setNumberOfWheels(userInput.nextInt());
            System.out.println("What type of engine?");
            car.setEngine(userInput.next());
            System.out.println("How many doors?");
            car.setNumberOfDoors(userInput.nextInt());
            System.out.println("What color?");
            car.setColor(userInput.next());
        }
    }
}
