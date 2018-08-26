public class cars {
    private String model;
    private int numberOfWheels;
    private String engine;
    private int numberOfDoors;
    private String color;

    //public class name ... This is a class constructor
    /* */
    public cars(String model, int numberOfWheels, String engine, int numberOfDoors, String color){
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    /*Print the specifications of the car*/
    public void aboutCar(){
        System.out.println("Car specs:");
        System.out.println("The color is" + this.color);
    }

    void setModel(String model){
        this.model = model;
    }//End setModel method

    String getModel(){
        return this.model;
    }//End getModel method

    public String getEngine() {
        return engine;
    }//End getter for engine

    public void setEngine(String engine) {
        this.engine = engine;
    }//End setter for engine

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }//End setter for number of wheels

    public int getNumberOfDoors() {
        return numberOfDoors;
    }//End getter for number of doors

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }//End setter for number of doors

    public String getColor() {
        return color;
    }//End getter for color

    public void setColor(String color) {
        this.color = color;
    }//End setter for color
}
