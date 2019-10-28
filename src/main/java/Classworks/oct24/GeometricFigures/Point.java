package Classworks.oct24.GeometricFigures;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    public Point() {
        Random random = new Random();
        setX(random.nextInt(20));
        setY(random.nextInt(20));
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int X() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int Y() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" +
                 x + ',' +
                 y +
                ')';
    }
}
