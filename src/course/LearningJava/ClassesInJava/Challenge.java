package course.LearningJava.ClassesInJava;

class StudentProfile {
    String firstName;
    String lastName;
    double GPA;
    String declaredMajor;
    int expectedGraduationYear;

    public StudentProfile(String firstName, String lastName, double GPA, String declaredMajor, int expectedGraduationYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
        this.expectedGraduationYear = expectedGraduationYear;
    }

    public void incrementExpectedGraduationYear(){
        this.expectedGraduationYear = this.expectedGraduationYear +1;
    }
}

public class Challenge {
    public static void main(String[] args) {
        StudentProfile student1 = new StudentProfile("John", "Doe",
                                                    2.90,"Math", 2022);
        StudentProfile student2 = new StudentProfile("Alice", "Tan",
                                                    3.25,"IT", 2022);

        student1.incrementExpectedGraduationYear();
        System.out.println(student1.expectedGraduationYear);
    }
}
