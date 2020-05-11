package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4,5);
        Rectangle box2 = new Square(6);

        System.out.println(box1.getArea(4,5));
        System.out.println(box1.getPerimeter(4,5));
        System.out.println(box2.getArea(0,0));
        System.out.println(box2.getPerimeter(0,0));
    }
}
