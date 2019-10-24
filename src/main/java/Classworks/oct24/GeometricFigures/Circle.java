package Classworks.oct24.GeometricFigures;

public class Circle extends AbstractFigure{
    Point c;
    int r;

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return  (Math.PI * r * r);
    }

    public Circle(Point c, int r) {
        this.c = c;
        this.r = r;
    }
}
