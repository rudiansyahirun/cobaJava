package course.LearningJavaApplication.JavaBasicsReview;

public class Functions {
    public static void main(String[] args) {
        Functions.printS("This is a static method");

        Functions myFuncNS = new Functions();
        myFuncNS.printNS("This is an instance method");
    }

    // non static method, attach to the instance of a class
    void printNS(String data){
        System.out.println(data);
    }

    // static method, attach to the class
    static void printS(String data) {
        System.out.println(data);
    }
}
