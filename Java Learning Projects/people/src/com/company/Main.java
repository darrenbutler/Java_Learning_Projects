package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person person1 = new Person('M', 8, "Mon", "Brown", 5.8, "Baptist",
                "Bahamian", 2, 2, 2);

        Person person2 = new Person('f', 12, "Mahalia", "Brown", 5.8, "Baptist"
                , "Bahamian", 2, 2, 2);

        person1.aboutPerson();
        System.out.println("Let's talk about what they like.");
        person1.likes();

        person1.peopleName();
        person1.nationalityCheck();

        person2.ageCheck();
    }
}
