package Classworks.oct28.Comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class SortArray {

    public static void main(String[] args) {
        RandomNumbersGenerator app = new RandomNumbersGenerator();
        ArrayList<Integer> arrayList = app.generateRandomNumbers(30);

        System.out.println(arrayList.toString());

        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if(a % 2 == 0 && b % 2 == 1) return -1;
                if(a % 2 == 1 && b % 2 == 0) return 1;
                if(a % 2 == 1)return a - b;
                return b - a;
            }
        });
        System.out.println(arrayList.toString());
    }
}
