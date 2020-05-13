package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Square(7,4);
        Measurable myShape2 = new Rectangle(6, 8);

        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape2.getArea() = " + myShape2.getArea());
        System.out.println("myShape2.getPerimeter() = " + myShape2.getPerimeter());
    }

}
