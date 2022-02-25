package course.LearningJava.ControlFlow;

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        String favoriteFood = "pizza";
        // In scope (accessible) for favoriteFood
        System.out.println("My favorite food is " + favoriteFood);
        
        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();
        
        if (inputtedNum < 100) {
            // In scope (accessible) for favoriteFood
            favoriteFood = "chicken tacos";
            System.out.println("My favorite food is " + favoriteFood);
        } else {
            // In scope (accessible) for favoriteFood
            favoriteFood = "steak";
            System.out.println("My favorite food is " + favoriteFood);
        }
        // In scope (accessible) for favoriteFood
    }
}
