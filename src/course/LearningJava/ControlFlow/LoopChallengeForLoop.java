package course.LearningJava.ControlFlow;

import java.util.Scanner;

public class LoopChallengeForLoop {
    public static void main(String[] args) {
        // implement a Multiple-choice question
        String question = "What is the capital of the United States?";
        String[] answers = {"Washington", "New York", "Los Angeles", "Chicago"};
        int correctAnswer = 0;
        int userAnswer = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println(question);
        for (int i = 0; i < answers.length; i++) {
            System.out.println(i + ": " + answers[i]);
        }
        System.out.println("Enter your answer: ");
        userAnswer = scanner.nextInt();
        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
