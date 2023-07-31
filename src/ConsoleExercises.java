import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The approximate value of PI is %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter an Integer%n");
//        int userInt = scanner.nextInt();
//        System.out.printf("Your number is: %d%n",userInt);
//
//        System.out.printf("Enter 3 words%n");
//        String userString1 = scanner.next();
//        String userString2 = scanner.next();
//        String userString3 = scanner.next();
//        System.out.printf("%s%n%s%n%s%n",userString1, userString2, userString3);
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.printf("Enter a Sentence%n");
//        String userSentence = scanner2.nextLine();
//        System.out.printf("%s", userSentence);

//        Scanner scanner3 = new Scanner(System.in);
//        System.out.printf("Enter the length of your room%n");
//        String length = scanner3.nextLine();
////        int lengthNum = Integer.parseInt(length);
//        float lengthNum = Float.parseFloat(length);

//        Scanner scanner4 = new Scanner(System.in);
//        System.out.printf("Enter the width of your room%n");
//        String width = scanner4.nextLine();
////        int widthNum = Integer.parseInt(width);
//        float widthNum = Float.parseFloat(width);
//
//        System.out.printf("Length: %f%nWidth: %f%n", lengthNum, widthNum);
//        float area = widthNum*lengthNum;
//        System.out.printf("Area: %f%n", area);
//        float perimeter = (widthNum*2)+(lengthNum*2);
//        System.out.printf("Perimeter: %f%n", perimeter);

        Scanner scanner3 = new Scanner(System.in);
        scanner3.useDelimiter("%n");
        System.out.printf("Enter the length of your room%nEnter the width of your Room\n");

        String length = scanner3.nextLine();
        String width = scanner3.nextLine();

        float lengthNum = Float.parseFloat(length);
        float widthNum = Float.parseFloat(width);

        System.out.printf("Length: %f%nWidth: %f%n", lengthNum, widthNum);
        float area = widthNum * lengthNum;
        System.out.printf("Area: %f%n", area);
        float perimeter = (widthNum * 2) + (lengthNum * 2);
        System.out.printf("Perimeter: %f%n", perimeter);
    }
}
