package course.JavaEssentialTraining.ManageProgramFlow;

import java.time.LocalDateTime;

public class EvaluateConditionsWithSwitchCase {
    public static void main(String[] args) {
        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();

        switch (monthNumber) {
            case 1 -> System.out.println("The month is January");
            case 2 -> System.out.println("The month is February");
            case 3 -> System.out.println("The month is March");
            case 9, 10, 11 -> System.out.println("It's the 4th quarter");
            default -> System.out.println("You choose another month");
        }
    }
}
