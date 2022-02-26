package course.JavaEssentialTraining.ManageString;

public class CompareStringValues {
    public static void main(String[] args) {
        String s1 = "Hello!";
        var s2 = "Hello!";

        if (s1 == s2) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        String s3 = new String("Hello!");
        String s4 = new String("Hello!");

        if (s3 == s4) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        if (s3.equals(s4)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }

        var s5 = "HELLO!";
        if (s3.equalsIgnoreCase(s5)) {
            System.out.println("They match!");
        } else {
            System.out.println("They don't match!");
        }
    }
}
