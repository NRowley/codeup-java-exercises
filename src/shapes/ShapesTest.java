package shapes;
//create a variable of the type Rectangle named box1 and assign it a new instance of the
//Rectangle class with a width of 4 and a length of 5
//verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//create a variable of the type Rectangle named box2 and assign it a new instance of the
//Square class that has a side value of 5.
//verify that the getPerimeter and getArea methods return 20 and 25, respectively.

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        Rectangle box2 = new Square(5);
//
//        System.out.println("Area: "+ box1.getArea() + "\nPerimeter: " + box1.getPerimeter());
//        System.out.println("Area: "+ box2.getArea() + "\nPerimeter: " + box2.getPerimeter());

        Measurable myShape = new Rectangle(4, 5);
        Measurable myShape2 = new Square(5);
        System.out.println("Rectangle\nArea: " + myShape.getArea() + "\nPerimeter: " + myShape.getPerimeter());
        System.out.println("Square\nArea: " + myShape2.getArea() + "\nPerimeter: " + myShape2.getPerimeter());
        System.out.println("Get L/W Rectangle\nL: " + myShape.getWidth() + "\nW: " + myShape.getLength());
    }
}
