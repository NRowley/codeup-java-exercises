import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.

//        int i = 5;
//        while (i <= 15) {
//            System.out.printf("%d ", i);
//            i++;
//        }

//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.

//        int num = 0;
//        do {
//            System.out.printf("%d\n", num);
//            num += 2;
//        } while (num <= 100);

//        int num = 100;
//        do {
//            System.out.printf("%d\n", num);
//            num -= 5;
//        } while (num >= -10);

//        long num = 2;
//        do{
//            System.out.printf("%d%n", num);
//            num *= num;
//        } while (num <= 1000000);

//        Refactor the previous two exercises to use a for loop instead./////////////////////////////////////
//        for(int i = 100; i >= -10; i-=5){
//            System.out.printf("%d%n",i);
//        }
//        for(long num = 2; num <=1000000; num*=num){
//            System.out.printf("%d\n",num);
//        }

////////////////////////////////////////////////////////////
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 & i % 5 == 0) {
//                System.out.printf("%d! FIZZBUZZ!!!\n", i);
//            } else if (i % 5 == 0) {
//                System.out.printf("%d! BUZZ!!\n", i);
//            } else if (i % 3 == 0) {
//                System.out.printf("%d! FIZZ!!\n", i);
//            }
//        }
//////////////////////////////////////////////////////////////
//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.

        Scanner numScan = new Scanner(System.in);
        System.out.print("What number would you like to go up to?\n");
        int num = numScan.nextInt();
        System.out.printf("%d\n", num);

        for (int i = 1; i <= num; i++) {
            if (i == 1) {
//                System.out.printf("%s%10s%10s\n","number","squared","cubed");
                System.out.printf("number | squared | cubed |\n-------+---------+-------+\n");
            }
            int square = i * i;
            int cube = i * i * i;
            System.out.printf("%-6d | %-8d| %-5d |%n", i, square, cube);
            if (i == num) {
                Scanner confirmScan = new Scanner(System.in);
                System.out.println("Continue?[y/n]");
                String confirm = confirmScan.next();
                if (confirm.equals("y")) {
                    Scanner newNumScan = new Scanner(System.in);
                    System.out.printf("Enter a number greater than %d\n", num);
                    num = newNumScan.nextInt();
                }
            }
        }


        ////////////////////////////////////////////////////////////////////////////////
//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        Scanner gradeScan = new Scanner(System.in);
        Scanner enterScan = new Scanner(System.in);
        String enterGrade = "y";
        do {
            System.out.println("Enter a grade from 0 - 100\n");
            int grade = gradeScan.nextInt();
            if (grade >= 88) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 67) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Enter another grade?[y/n]\n");
            enterGrade = enterScan.next();
        } while (enterGrade.equalsIgnoreCase("y"));
    }
}
