package Classworks.oct24.GeometricFigures;

public class Triangle extends AbstractFigure {

    private Point p1;
    private Point p2;
    private Point p3;

    public Point P1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point P2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point P3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    @Override
    public double area() {
        double area= (p1.X() * p2.Y() + p2.X() * p3.Y() + p3.X()*p1.Y()
                - p1.X()*p3.Y() - p2.X()*p1.Y() - p3.X()*p2.Y()) * 1.0 /2;
        if(area < 0) area = - area;
        return area;

    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
}
