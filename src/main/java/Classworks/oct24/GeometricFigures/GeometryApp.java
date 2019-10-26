package Classworks.oct24.GeometricFigures;

import java.util.function.Consumer;

public class GeometryApp {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 0);
        Point p3 = new Point(0, 5);


        Triangle t = new Triangle(p1, p2, p3);
        System.out.println("Area of the triangle with points " + p1.toString() + " "
                + p2.toString() + " " + p3.toString() + " is " + t.area());

        Rectangle rectangle = new Rectangle(p2, p3);
        System.out.println("Area of the triangle with UpperLeft Point =  " + p2.toString() +
                " and LowerRight Point = " + p3.toString() + " is " +  rectangle.area());

        int r = 5;
        Circle circle = new Circle(p1, r);
        System.out.println("Area of the Circle with Radious =  " + r +
                 " is " +  circle.area());

    }



}
