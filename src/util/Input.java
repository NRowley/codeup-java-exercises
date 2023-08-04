//Create a package inside of src named util. Inside of util,
// create a class named Input that has a private field named scanner.
// When an instance of this object is created,
// the scanner field should be set to a new instance of the Scanner class.
// The class should have the following methods, all of which return command line input from the user:
//
//        String getString()
//        boolean yesNo()
//        int getInt(int min, int max)
//        int getInt()
//        double getDouble(double min, double max)
//        double getDouble()
//        The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//        The getInt(int min, int max) method should keep prompting the user for input
//        until they give an integer within the min and max.
//        The getDouble method should do the same thing, but with decimal numbers.
//
//        Create another class named InputTest that has a static main method that uses all the methods from the Input class.

package util;

import java.util.Scanner;

public class Input {
    private final Scanner inputScan;

    public Input() {
//        System.out.println("creating new input scanner");
        inputScan = new Scanner(System.in);
    }

    //String getString()
    public String getString() {
//        System.out.println("Get String Method");
        return inputScan.next();
    }

    //        boolean yesNo()
    public Boolean yesNo() {
//        System.out.println("yesNo Method");
        String input = inputScan.next();
        boolean output = false;
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            output = true;
        } else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")) {
            return output;
        }
        return output;
    }

    //        int getInt(int min, int max)
    public int getInt(int min, int max) {
//        System.out.println("get Int (min max)");
        int userInt = inputScan.nextInt();
        while (userInt < min || userInt > max) {
            System.out.printf("Enter a integer from %d - %d\n", min, max);
            userInt = inputScan.nextInt();
        }
        return userInt;
    }

    //        int getInt()
    public int getInt() {
        return inputScan.nextInt();
    }

    //        double getDouble(double min, double max)
    public double getDouble(double min, double max) {
//        System.out.println("get double (min max)");
        double userDouble = inputScan.nextDouble();
        while (userDouble < min || userDouble > max) {
            System.out.printf("Enter a decimal number from %f - %f\n", min, max);
            userDouble = inputScan.nextDouble();
        }
        return userDouble;
    }

    //        double getDouble()
    public double getDouble() {
//        System.out.println("get double");
        return inputScan.nextDouble();
    }
}

