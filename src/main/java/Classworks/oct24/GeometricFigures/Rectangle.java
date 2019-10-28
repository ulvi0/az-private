package Classworks.oct24.GeometricFigures;

public class Rectangle implements Figure, Comparable{
    Point upperLeft;
    Point lowerRight;

    public Rectangle() {
        this.upperLeft = new Point();
        this.lowerRight = new Point();
    }

    public Rectangle(Point upperLeft, Point lowerRight) {
        this.upperLeft = upperLeft;
        this.lowerRight = lowerRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getLowerRight() {
        return lowerRight;
    }

    public void setLowerRight(Point lowerRight) {
        this.lowerRight = lowerRight;
    }

    @Override
    public double area() {
        return (upperLeft.Y() - lowerRight.Y()) * (lowerRight.X() - upperLeft.X());
    }
    @Override
    public int compareTo(Object o) {
        Figure that = (Figure) o;
        return (int)(this.area() - that.area());
    }
}
