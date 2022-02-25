package app;//public class app.Objects {
//    public static void main(String[] args) {
//        // Create a new object of type Person
//        Person person = new Person();
//        // Set the name of the person
//        person.setName("John");
//        // Set the age of the person
//        person.setAge(30);
//        // Print the person's name and age
//        System.out.println(person.getName() + " is " + person.getAge() + " years old.");
//    }
//}

public class Objects{
    public static void main(String[] args){
        Method newMet = new Method();
        newMet.setName("Alex");
        newMet.setAge(28);

        Method anoMet = new Method();
        anoMet.setName("Andria");
        anoMet.setAge(27);

        System.out.println(newMet.getName() + " is " + newMet.getAge() + " years old.");
        System.out.println(anoMet.getName() + " is " + anoMet.getAge() + " years old.");
    }
}

class Method{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

//class Person {
//    // Declare a String variable to store the name of the person
//    private String name;
//    // Declare an int variable to store the age of the person
//    private int age;
//    // Declare a String variable to store the name of the person
//    public String getName() {
//        return name;
//    }
//    // Declare a String variable to store the name of the person
//    public void setName(String name) {
//        this.name = name;
//    }
//    // Declare an int variable to store the age of the person
//    public int getAge() {
//        return age;
//    }
//    // Declare an int variable to store the age of the person
//    public void setAge(int age) {
//        this.age = age;
//    }
//}

