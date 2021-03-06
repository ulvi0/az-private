package Classworks.oct28.Comparator;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class RandomNumbersGenerator {
    public ArrayList<Integer> generateRandomNumbers(int length, int min, int max){
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < length; i++){
            array.add(random.nextInt(max - min) + min);
        }
        return array;
    }

}
