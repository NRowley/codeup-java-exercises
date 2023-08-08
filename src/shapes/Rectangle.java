package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(int l, int w) {
        super(l, w);
    }

    @Override
    public double getPerimeter() {
        return this.length * this.width;
    }

    @Override
    public double getArea() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public void setLength() {
    }

    @Override
    public void setWidth() {
    }
//    protected int length;
//    protected int width;
//
//    public Rectangle(int l, int w) {
//        this.length = l;
//        this.width = w;
//    }
//
//    public int getArea() {
//        return (2 * this.length) + (2 * this.width);
//    }
//
//    public int getPerimeter() {
//        return this.length * this.width;
//    }


}

