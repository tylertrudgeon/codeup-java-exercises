package shapes;

import java.awt.Shape;

public abstract class Quadrilateral implements Measurable{

    protected double length;
    protected double width;

    abstract double setLength();
    abstract double setWidth();

    public Quadrilateral (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
