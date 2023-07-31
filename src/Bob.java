import java.util.Random;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.

        Scanner userPrompt = new Scanner(System.in);
        String str;

        do {
            Random random = new Random();
            int randNum = random.nextInt(10);
            System.out.println("Ask Bod a question? (Enter \"X\" to end)");
            str = userPrompt.nextLine();

            if (str.endsWith("?")) {
                if (randNum >= 8) {
                    System.out.println("Bob: Sure...");
                } else if (randNum >= 3) {
                    System.out.println("Bob: Who cares...");
                } else {
                    System.out.println("Bob: I dunno...");
                }

            } else if (str.equalsIgnoreCase("Hi") || str.equalsIgnoreCase("Hello") || str.equalsIgnoreCase("Yo") || str.equalsIgnoreCase("what's up") || str.equalsIgnoreCase("S'up")) {
                if (randNum >= 8) {
                    System.out.println("Bod: S'up...");
                } else if (randNum >= 3) {
                    System.out.println("Bob: Do I know you?");
                } else {
                    System.out.println("Bob: Ok...");
                }

            } else if (str.endsWith("!")) {
                if (randNum >= 8) {
                    System.out.println("Bob: Whoa, chill out!");
                } else if (randNum >= 3) {
                    System.out.println("Bob: Like, leave me alone man...");
                } else {
                    System.out.println("Bob: What's your deal?");
                }

            } else if (str.equalsIgnoreCase("")) {
                if (randNum >= 8) {
                    System.out.println("Bob: Fine. Be that way!");
                } else if (randNum >= 3) {
                    System.out.println("Bob: Got nothing to say?");
                } else {
                    System.out.println("Bob: Didn't feel like talking anyway...");
                }

            } else if (str.length() >= 20) {
                if (randNum >= 8) {
                    System.out.println("Bob: You talk too much, man...");
                } else if (randNum >= 3) {
                    System.out.println("Bob: Not my problem...");
                } else {
                    System.out.println("Bob: ...What?");
                }

            } else {
                if (randNum >= 8) {
                    System.out.println("Bob: Whatever...");
                } else if (randNum >= 3) {
                    System.out.println("Bob: Later");
                } else {
                    System.out.println("Bob: I'm out of here.");
                }
            }
        } while (!str.equalsIgnoreCase("x"));
    }
}
