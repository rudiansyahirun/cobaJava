package course.LearningJava.Foundation;

import java.util.Scanner;

public class Concatination {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // concatenation
        double studentGPA = 3.45;
        String studentFirstName = "John";
        String studentLastName = "Doe";
        System.out.println("Hello " + studentFirstName + " " + studentLastName + " your GPA is " + studentGPA);

        // input and output
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);
    }
}
