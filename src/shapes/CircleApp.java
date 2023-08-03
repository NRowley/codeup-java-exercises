//Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)
//
//        The formulas for the circumference and area:
//circumference = 2 x pi x radius
//        area = pi x (radius ^ 2)

//After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another. Continue creating circles and displaying information about them until the user says they do not want to continue.
//
//Before exiting, the program should output the total number of circles created. Use a private static field, along with a public static method to keep track of and display the total number of circles created.

package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean moreCircles;
        int circleCount = 0;
        do {
            Input scanner = new Input();
            double radius = scanner.getDouble();
            Circle circle = new Circle(radius);
            System.out.println("The area of the circle is: " + circle.getArea());
            System.out.println("The circumference of the circle is: " + circle.getCircumference());
            circleCount++;
            System.out.println("Make another circle?[y/n]");
            moreCircles = scanner.yesNo();
        } while (moreCircles);
        System.out.println(circleCount + " circles made");
    }
}
