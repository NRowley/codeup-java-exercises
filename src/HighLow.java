//Game Development 101
//
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number.
//        All user inputs are validated.
//        If user's guess is less than the number, it outputs "HIGHER".
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//        Hints
//
//        Use the random method of the java.lang.Math class to generate a random number.
//        Bonus
//
//        Keep track of how many guesses a user makes.
//        Set an upper limit on the number of guesses.

import java.util.Scanner;

public class HighLow {
    public static int getRandomNumber() {
        return ((int) (Math.random() * 100) + 1);
    }

    public static int validNumber() {
        Scanner validateScan = new Scanner(System.in);
        System.out.println("Guess a number from 1 to 100!");
        int num = validateScan.nextInt();
        while (num < 1 || num > 100) {
            System.out.println("Invalid number! Please enter a Number from 1 - 100");
            num = validateScan.nextInt();
        }
        System.out.println("Your guess is: " + num);
        return num;
    }

    public static String checkNumber(int userNum, int numToGuess) {
        String result;
        if (userNum > numToGuess) {
            result = "LOWER";
        } else if (userNum < numToGuess) {
            result = "HIGHER";
        } else {
            result = "HIT!";
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner userInputScan = new Scanner(System.in);

        System.out.println("Play the number guessing game?[y/n]");
        String userConfirmPlay = userInputScan.next();
        int numOfGuesses = 0;
        int highScore = 20;
        int maximumGuesses = 20;

        while (userConfirmPlay.equalsIgnoreCase("y")) {
            int numberToGuess = getRandomNumber();
            boolean gameComplete = false;
            while (!gameComplete) {
                int userNum = validNumber();
                String guessResult = checkNumber(userNum, numberToGuess);
                System.out.println(guessResult);
                if (guessResult.equalsIgnoreCase("HIT!")) {
                    if (numOfGuesses < highScore) {
                        highScore = numOfGuesses;
                    }
                    System.out.printf("Congratulations!\nYour score was %d guesses.\nThe current High Score is %d guesses\n", numOfGuesses, highScore);
                    gameComplete = true;
                } else if (numOfGuesses == maximumGuesses) {
                    System.out.printf("You have reached the maximum amount of guesses. You lose...\nThe current High Score is %d guesses\n", highScore);
                    gameComplete = true;
                }
                numOfGuesses = numOfGuesses + 1;
            }
            System.out.println("Play again?[y/n]");
            userConfirmPlay = userInputScan.next();
        }
        System.out.println("Thanks for playing!");
    }
}
