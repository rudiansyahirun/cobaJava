package course.LearningJava.ControlFlow;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Playeing current song");
            System.out.println("Do you want to play next song? (y/n)");
            String answer = input.nextLine();

            if (answer.equals("n")) {
                isOnRepeat = false;
            } else if (answer.equals("y")) {
                isOnRepeat = true;
            } else {
                System.out.println("Invalid input");
            }
        }
        System.out.println("Stopping the player");
    }
}
