// TODO: Write a method, returnName, that returns the string of your name.
// TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.
// TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.
// TODO: !! Complete math exercises from the curriculum !!

import java.util.Scanner;

public class MethodPractice {
    public static String returnName() {
        return "Nic Rowley";
    }

    public static String returnLongerString() {
        Scanner stringScan = new Scanner(System.in);
        System.out.println("Write something");
        String str1 = stringScan.next();
        System.out.println("Write something else");
        String str2 = stringScan.next();

        String longerStr = "";
        if (str1.length() > str2.length()) {
            longerStr = str1;
        } else if (str2.length() > str1.length()) {
            longerStr = str2;
        } else {
            longerStr = "Strings are equal";
        }
        return longerStr;
    }

    public static boolean canBeHalved() {
        Scanner numScan = new Scanner(System.in);
        boolean canHalf = false;
        System.out.println("Input a number");
        int num = numScan.nextInt();
        if (num % 2 == 0) {
            canHalf = true;
        }
        return canHalf;
    }

    public static void main(String[] args) {
//        System.out.println(returnName());
//        System.out.println(returnLongerString());
        System.out.println(canBeHalved());
    }
}
