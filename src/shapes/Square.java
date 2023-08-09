package shapes;

class Square extends Quadrilateral{
    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return this.length *4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public void setLength(int length) {
    }

    @Override
    public void setWidth(int width) {
    }

//    public Square(int side){
//        super(side, side);
//    }
//
//    public int getArea(){
//        return this.length * this.length;
//    }
//    public int getPerimeter(){
//        return this.length * 4;
//    }
}
