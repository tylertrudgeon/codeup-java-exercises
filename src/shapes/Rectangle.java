package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle (double length, double width) {
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
