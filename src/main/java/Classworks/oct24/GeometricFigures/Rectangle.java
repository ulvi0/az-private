package Classworks.oct24.GeometricFigures;

public class Rectangle extends AbstractFigure{
    Point upperLeft;
    Point lowerRight;

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
}
