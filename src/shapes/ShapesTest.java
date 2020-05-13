package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Square(7);

        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        myShape = new Rectangle(5,5);

        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
    }

}
