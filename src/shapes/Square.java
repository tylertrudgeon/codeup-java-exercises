package shapes;

public class Square extends Quadrilateral {


    public Square(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return (length * length) + (width * width);
    }

    public double getArea() {
        return length * width;
    }

    double setLength() {
        return this.length;
    }

    double setWidth() {
        return this.width;
    }
}
