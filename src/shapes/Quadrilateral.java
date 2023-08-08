package shapes;

//protected properties for length and width.
//a constructor that accepts two numbers for the length and width and sets those properties.
//methods for getting the length and width.
//abstract methods for setting the length and width.
abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public abstract void setLength();

    public abstract void setWidth();
}
