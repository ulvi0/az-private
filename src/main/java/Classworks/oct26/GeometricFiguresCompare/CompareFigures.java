package Classworks.oct26.GeometricFiguresCompare;
import Classworks.oct24.GeometricFigures.*;

import java.util.ArrayList;
import java.util.List;

public class CompareFigures {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<Figure>(){
            {
                add(new Circle());
                add(new Circle());
                add(new Triangle());
                add(new Rectangle());
                add(new Triangle());
            }
        };
        figures.forEach(f -> System.out.print(f.area() + " "));
        System.out.println();
        figures.sort((o1, o2)->(int)(o1.area() - o2.area()));
        figures.forEach(f -> System.out.print(f.area() + " "));
    }
}
