package course.LearningJava.ControlFlow;

import java.util.Scanner;

public class FortuneTelling {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        }
    }
}
