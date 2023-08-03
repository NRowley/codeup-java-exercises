
import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //GARBAGE!
        System.out.println(numbers);
        //GOOD
        System.out.println(Arrays.toString(numbers));
        ///////////////////////////////////////////////////////
//        Create an array that holds 3 Person objects.
//        Assign a new instance of the Person class to each element.
//        Iterate through the array and print out the name of each person in the array.
//
//        Create a static method named addPerson.
//        It should accept an array of Person objects, as well as a single person object to add to the
//        passed array.
//        It should return an array whose length is 1 greater than the passed array,
//        with the passed person object at the end of the array.

        Person testPerson = new Person("Nic");
        System.out.println(testPerson.getName());

//        Person[] people = new Person[3];
        Person[] people = {new Person("Nic"), new Person("Kaite"), new Person("Killian")};

        //Iterate with OG for loop
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

        //with ENHANCED for loop
//        for (Person person : people) {
//            System.out.println(person.getName());
//        }

        //adding a Person
        Person halen = new Person("Halen");
        people = addPerson(people, halen);
        getPeopleNames(people);
    }
    public static Person[] addPerson(Person[] array, Person newPerson){
        //        Create a static method named addPerson.
//        It should accept an array of Person objects, as well as a single person object to add to the
//        passed array.
//        It should return an array whose length is 1 greater than the passed array,
//        with the passed person object at the end of the array.
        Person[] newPeople = Arrays.copyOf(array, 4);
        newPeople[3] = newPerson;
        return newPeople;
//        System.out.println(Arrays.toString(newPeople));
    }

    public static void getPeopleNames(Person[] people){
        System.out.println("NEW people array");
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
