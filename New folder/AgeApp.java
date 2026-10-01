// AgeApp.java - Handles age checks and conditional prints

public class AgeApp {
    public static void main(String[] args) {
        int age = 5;

        if (age == 18) {
            System.out.println("You can drive a car.");
        }

        
        if (age >= 10 && age <= 120 && age % 10 == 0) {
            System.out.println("Anniversary Party!!");
        }

        if (age == 100) {
            System.out.println("Congratulations on a century!");
            System.out.println("Congratulations on a century!");
            System.out.println("Congratulations on a century!");
        }

        
        if (age >= 40 && age <= 50) {
            System.out.println("Happy mid-life!");
        }

        
        
       if (age >= 40 && age <= 50) {
            System.out.println("Happy mid-life!");
        }

        if (age >= 65) {
            System.out.println("You are retired.");
        } else if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age >= 15) {
            System.out.println("You can drive a moped.");
        } else if (age > 0) {
            System.out.println("You are underage.");
        } else {
            System.out.println("Invalid age.");
        }
    }
}

