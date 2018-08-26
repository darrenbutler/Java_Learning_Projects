package com.company;

public class Main {

    public static void main(String[] args) {

        Animal Animal1 = new Animal("Jay",1,1,2,4);
        System.out.println(Animal1.returnName());

        Fish grouper = new Fish("Grouper",1,1,1,2,"salt water");

        grouper.swim();
        Bird bluejay = new Bird("Jay",1,1,1,5,true,true,
                "blue");
        System.out.println(bluejay.returnName());



    }
}
