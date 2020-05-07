package shapes;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Circle {
    Scanner scan = new Scanner(System.in);

    private double radius;

    public void userInput(){
        System.out.println("Please enter a radius: ");
        radius = scan.nextDouble();
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * (radius*radius);
        System.out.println("Area = " + area);
        return area;
    }

    public double getCircumference(){
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference = " + circumference);
        return circumference;
    }
}
