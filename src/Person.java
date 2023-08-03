import java.util.Scanner;

public class Person {
    private String name;

    public Person(String personName){
        System.out.println("Creating new Person!");
        name = personName;
    }

    public String getName() {
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name) {
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello from " + this.name);
    }

    public static void main(String[] args) {
//        The class should have a constructor that accepts a `String` value and sets
//        the person's name to the passed string.
//        Create a `main` method on the class that creates a new `Person` object and
//        tests the above methods.

//        Person person = new Person("Killian");
////        Scanner personScan = new Scanner(System.in);
////        System.out.println("Enter a name for this person");
////        String newName = personScan.next();
//        person.setName("Killian");
//        System.out.println(person.getName());
//        person.sayHello();

/////////////////////////////////////////////////////////////////////////////////////
//        The following code blocks make use of the Person class from the previous exercise.
//        For each code block, think about what the code will output, then copy the code into IntelliJ
//        and run it to see if it matches your expectations.

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }
}