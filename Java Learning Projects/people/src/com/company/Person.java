package com.company;
import java.util.Scanner;
public class Person {
    private char gender;
    private int age;
    private String Name;

    private String SkinColor;
    private double height;
    private String religion;
    private String Nationality;
    private int numberofArms;
    private int numberofLegs;
    private int numberOfEyes;

    //CONSTRUCTOR
    public Person(char gender, int age, String Name, String SkinColor, double height,
                  String religion, String Nationality, int numberofArms, int numberofLegs, int numberOfEyes){
        this.gender = gender;
        this.age = age;
        this.Name = Name;

        this.SkinColor = SkinColor;
        this.height = height;
        this.religion = religion;
        this.Nationality = Nationality;
        this.numberofArms = numberofArms;
        this.numberOfEyes = numberOfEyes;
        this.numberofLegs = numberofLegs;

    }//End of person

    public void likes(){
        String personLikes;
        Scanner input = new Scanner(System.in);
        System.out.println(this.Name + " Likes...");
        personLikes = input.next();
        System.out.println(personLikes);
        System.out.println(this.Name + " likes " + personLikes + "!");

    }
    public void aboutPerson(){
        System.out.println("Here's what you should know about " + this.Name);
        System.out.println("Gender " + this.gender);
        System.out.println(ageCheck());
        System.out.println(SkinColorCheck());
        System.out.println("Height: " + this.height);
        System.out.println("Religion: " + this.religion);
        System.out.println("Nationality: " + this.Nationality);
        System.out.println("Number of Legs: " + this.numberofLegs);
        System.out.println("Number of eyes " + this.numberOfEyes);
        System.out.println("Number of arms: " + this.numberofArms);
    }

    public void peopleName(){
        if (Name.equalsIgnoreCase("mon")|| Name.equalsIgnoreCase("Mahalia")){
            System.out.println("Mon and Mahalia are friends.");
        } else {
            System.out.println("They don't know each other.");
        }// End
    }///End peopleName

    public void nationalityCheck(){
        switch (Nationality.toLowerCase()){
            case "bahamian":
                System.out.println(Name + " is a proud Bahamaian");
                break;
            default:
                System.out.print("Bahamian or nuttin!");
                break;
        }//End nationality check
    }//end nationality check method

    public String ageCheck(){
        if(age >= 10){
            return (Name + " is a preteen.");
        } else {
            return (Name + " is quite young.");
        }
    }//end age check

    public String SkinColorCheck(){
        if (SkinColor.equalsIgnoreCase("brown")){
            return ("Has brown skin.");
        } else {
            return ("Needs a tan.");
        }
    }//End Skin color check

}
