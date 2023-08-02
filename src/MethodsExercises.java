//Basic Arithmetic
//
//        Create four separate methods. Each will perform an arithmetic operation:
//
//        Addition
//        Subtraction
//        Multiplication
//        Division
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//
//        Test your methods and verify the output.
//        Add a modulus method that finds the modulus of two numbers.
//        Food for thought: What happens if we try to divide by zero? What should happen?

//Bonus
//
//        Create your multiplication method without the * operator (Hint: a loop might be helpful).
//        Do the above with recursion.

//Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.

//Calculate the factorial of a number.
//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//        Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//        Factorials are denoted by the exclamation point (n!). Ex:

//Create an application that simulates dice rolling.
//
//        Ask the user to enter the number of sides for a pair of dice.
//        Prompt the user to roll the dice.
//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//        Use the .random method of the java.lang.Math class to generate random numbers.

import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int multiplyLoop(int x, int y) {
        int num = x;
        for (int i = 1; i < y; i++) {
            num += x;
        }
        return num;
    }

    public static void multiplyRecursion(int x, int y) {
        if (y == 0) {
            System.out.println(x);
            return;
        }

        x = (x + (y + (y - 1))) - 1;
//        System.out.println(x);
        multiplyRecursion(x, (y - 1));
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }

    public static int getInteger(int min, int max) {
        Scanner intRangeScan = new Scanner(System.in);
        int userInput = intRangeScan.nextInt();
        while (userInput < min || userInput > max) {
            System.out.printf("ERROR %d is not a valid input!\n Enter a number between %d and %d\n", userInput, min, max);
//            getInteger(min, max);
            userInput = intRangeScan.nextInt();
        }
        return userInput;
    }

    public static void factorial(int num) {
        String factorialString = num + "! = " + num;
        int factorialNum = num;
        long result = num;

        for (int i = 1; i < num; i++) {
            factorialNum = factorialNum - 1;
            result = result * factorialNum;
            factorialString += " x " + factorialNum;
        }
        factorialString += " = " + result;
        System.out.println(factorialString);

    }

    public static String diceRoll(int diceAmount, int diceSides) {
//        Random random = new Random();
        String diceRolls = "Dice Rolls: \n";
        for (int i = 0; i < diceAmount; i++) {
//            int roll = random.nextInt(diceSides);
            int roll = (int) (Math.random() * diceSides) + 1;
            diceRolls += "Roll#" + (i + 1) + ": " + (roll) + "\n";
        }
        return diceRolls;
    }


    //MAIN///////////////////////////////////////////////////
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueConfirm = "y";

        //for math methods
//        System.out.println("Enter 2 numbers separated by spaces");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();

//        //Input validation and Factorials
        while (continueConfirm.equalsIgnoreCase("y")) {
            //for user Input Validation
            System.out.println("Enter a number between 1 - 10: ");
            int userInput = getInteger(1, 10);
            System.out.printf("%d is a valid input\n", userInput);

            //for factorial Calculation
//            System.out.println("Factorial: " + factorial(userInput));
            factorial(userInput);
            System.out.println("Run another factorial?[y/n]");
            continueConfirm = scanner.next();
        }

        //Dice rollin
//        System.out.println("Enter the amount and sides of the dice: ");
//        int diceAmount = scanner.nextInt();
//        int diceSides = scanner.nextInt();
//        System.out.println(diceRoll(diceAmount, diceSides));

//        System.out.println("Calling add Method: " + add(x, y));
//        System.out.println("Calling subtract Method: " + subtract(x, y));
//        System.out.println("Calling multiply Method: " + multiply(x, y));
//        System.out.println("Calling divide Method: " + divide(x, y));
//        System.out.println("Calling modulus Method: " + modulus(x, y));
//        System.out.println("Calling multiply Method: " + multiplyLoop(x, y));
//        multiplyRecursion(x, y);

    }
}
