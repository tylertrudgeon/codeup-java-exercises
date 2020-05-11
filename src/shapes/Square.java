package shapes;

public class Square extends Rectangle {

    public double side;

    public Square (double side) {
        super (Rectangle.length, Rectangle.width);
        this.side = side;
    }

    public double getArea (double length, double width) {
        return Math.pow(side, 2);
    }

    public double getPerimeter (double length, double width) {
        return side * 4;
    }


}
