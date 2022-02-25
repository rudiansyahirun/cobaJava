package course.LearningJava.ControlFlow;

import java.util.Objects;
import java.util.Scanner;

public class LoopChallengeMySolution {
    public static void main(String[] args) {
        String question = "What is the capital of United States?";
        String choiceOne = "New York";
        String choiceTwo = "Washington";
        String choiceThree = "Los Angles";

        String correctAnswer = choiceTwo;

        // write a print statement asking the question
        System.out.println(question);
        // write a print statement giving the answer choices
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        // have the user input an answer
        Scanner userInput = new Scanner(System.in);
        // retrieve the user's input
        String userAnswer = userInput.nextLine();

        // if the user's input matches the correctAnswer..
        if (Objects.equals(userAnswer, correctAnswer)){
            // then print out a congrats message to the user
            System.out.println("Congratulation! It's the correct answer!");
        } else { // if the user's input does not match the correctAnswer
            // then print out a sorry message to the user
            System.out.println("Sorry, your answer is incorrect.");
        }
    }
}
