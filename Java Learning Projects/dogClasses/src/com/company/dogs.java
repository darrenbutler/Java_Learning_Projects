package com.company;


public class dogs {
    //Instance variables for dogs superclass
    private String name;
    private int age;
    private String breed;
    private int weightInPounds;

    public void setName(String name){
        this.name = name;
    }//End set name method

    public String getName(){
        return this.name;
    }//End get name method

    public  void setAge(int age){
       this.age = age;
    }//end setAge

    public int getAge(){
        return this.age;
    }//end getAge

    public void setBreed(String breed){
        this.breed = breed;
    }//End method to set breed

    public String getBreed(){
        return this.breed;
    }//End getBreed method

    public void setWeightInPounds(int weightInPounds){
        this.weightInPounds = weightInPounds;
    }//End setWeightInPounds method

    public int getWeightInPounds(){
        return this.weightInPounds;
    }
}//End dog class
