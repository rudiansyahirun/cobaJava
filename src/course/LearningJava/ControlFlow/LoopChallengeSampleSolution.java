package course.LearningJava.ControlFlow;

import java.util.Scanner;

public class LoopChallengeSampleSolution {
    public static void main(String[] args) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "saturn";

        String correctAnswer = choiceTwo;

        // write a print statement asking the question
        System.out.println(question);
        // write a print statement giving the answer choices
        System.out.println("Chose one of the following: " +
                choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

        // have the user input an answer
        Scanner userInput = new Scanner(System.in);
        // retrieve the user's input
        String userAnswer = userInput.nextLine();

        // if the user's input matches the correctAnswer..
        if (correctAnswer.equals(userAnswer.toLowerCase())){
            // then print out a congrats message to the user
            System.out.println("Congratulation! It's the correct answer!");
        } else { // if the user's input does not match the correctAnswer
            // then print out a sorry message to the user
            System.out.println("Sorry, your answer is incorrect. The correct answer is " + correctAnswer);
        }
    }
}
