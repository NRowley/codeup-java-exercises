//STEP 1
//
//Create a static divideNums method that takes in two integer arguments. If the second argument is 0, the method should throw an IllegalArgumentException with the message "Cannot divide be 0!" If the second argument is not 0, return the result of dividing the first input integer by the second input integer.
//
//STEP 2
//
//Add a main method and try calling the divideNums method with various arguments, including 0 for the second argument. Is IllegalArgumentException a checked or unchecked exception?
//
//STEP 3
//
//Create a public static void method called delayedHello that takes in an integer argument for the number of milliseconds of delay before "Hello World" is printed to the console. Use Thread.sleep() in the method to accomplish this. Does Thread.sleep() throw a checked or unchecked exception?
//
//STEP 4
//Test the delayedHello method with various delay lengths.
//
//-- BONUS
//Use Thread.sleep() to create a program that will take in a string of input and display it in the console as if someone where typing each character. Consider that the delay between one character being printed and the next may randomly vary between a certain range of delays.

public class ExceptionExercises {
    public static double divideNums(int numX, int numY) {
        if (numY == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return (double) numX / numY;
    }

    public static void main(String[] args) {
        System.out.println(divideNums(10, 2));
    }
}
