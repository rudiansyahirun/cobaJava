package course.LearningJava.FunctionsInJava;

public class CalculateEmployeeSalary {
    public static double employeeSalary(double hoursPerWeek, double amountPerHour, double vacationDays){
        double hoursPerVacationDay = 8 * vacationDays;
        return amountPerHour * (hoursPerWeek - hoursPerVacationDay);
    }

    public static void main(String[] args) {
        double grossSalary = employeeSalary(40, 15, 2);
        System.out.println(grossSalary);
    }
}
