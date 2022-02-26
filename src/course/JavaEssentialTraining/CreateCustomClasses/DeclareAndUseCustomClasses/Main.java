package course.JavaEssentialTraining.CreateCustomClasses.DeclareAndUseCustomClasses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);

        double d1, d2;

        try {
            System.out.println("Enter a numeric value: ");
            d1 = scn.nextDouble();
            scn.nextLine();

            System.out.println("Enter a numeric value: ");
            d2 = scn.nextDouble();
            scn.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("Couldn't format as a number");
            return;
        }

        System.out.println("Select an operation (+ - * /): ");
        var operation = scn.nextLine();

        double result;
        switch (operation) {
            case "+":
                result = CalcOperator.addValues(d1, d2);
                break;
            case "-":
                result = CalcOperator.subtractValues(d1, d2);
                break;
            case "*":
                result = CalcOperator.multiplyValues(d1, d2);
                break;
            case "/":
                result = CalcOperator.divideValues(d1, d2);
                break;
            default:
                System.out.println("You didn't choose a valid operation");
                return;
        }
        System.out.println("The answer is " +result);
    }
}
