package shapes;

public class Square extends Rectangle {

    public double side;

    public Square (double side) {
        super (Rectangle.length, Rectangle.width);
        this.side = side;
    }

    public double getArea () {
        return Math.pow(side, 2);
    }

    public double getPerimeter () {
        return side * 4;
    }


}
