package Classworks.nov21;

import Classworks.oct28.Comparator.RandomNumbersGenerator;

import java.util.List;

public class App {
    public static void main(String[] args) {
        RandomNumbersGenerator random = new RandomNumbersGenerator();
        List<Integer> origin = random.generateRandomNumbers(30, -10, 10);
        Solution app = new Solution();
        System.out.println(origin);
        origin = app.process(origin);
        System.out.println(origin);
    }
}
