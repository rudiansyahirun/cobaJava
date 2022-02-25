package course.LearningJava.ControlFlow;

import java.util.Scanner;

public class LoopChallengeMySolution1 {
    public static void main(String[] args) {
        String question = "What is the capital of United States?";
        String choiceOne = "New York";
        String choiceTwo = "Washington";
        String choiceThree = "Los Angles";

        String correctAnswer = choiceTwo;

        // write a print statement asking the question
        System.out.println(question);

        // loop through, if the answer in incorrect
        boolean correct = false; // loop if false
        while (!correct) {
            // write a print statement giving the answer choices
            System.out.println("Choose one of the following: " +
                    choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

            // have the user input an answer
            Scanner userInput = new Scanner(System.in);
            // retrieve the user's input
            String userAnswer = userInput.nextLine();

            // if the user's input matches the correctAnswer..
            if (userAnswer.equals(correctAnswer.toLowerCase())) {
                // then print out a congrats message to the user
                System.out.println("Congratulation! It's the correct answer!");
                // end while loop
                correct = true;
            } else { // if the user's input does not match the correctAnswer
                // then print out a sorry message to the user
                System.out.println("Sorry, your answer is incorrect.");
                // loop while if false
                correct = false;
            }
        } // end of while
    }
}
