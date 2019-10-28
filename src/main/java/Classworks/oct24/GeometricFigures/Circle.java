package Classworks.oct24.GeometricFigures;

public class Circle implements Figure,Comparable{
    Point c;
    int r;

    public Circle() {
        setC(new Point());
        setR((int)(Math.random() * 20));
    }

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


    public double area() {
        return (Math.PI * r * r);
    }

    public Circle(Point c, int r) {
        this.c = c;
        this.r = r;
    }

    @Override
    public int compareTo(Object o) {
        Figure that = (Figure) o;
        return (int)(this.area() - that.area());
    }
}
