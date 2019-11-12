package Classworks.nov2.MinimalPair;

import java.util.ArrayList;
import java.util.Random;

public class RandomArray {
    public ArrayList<Integer> generateRandomArray(int length, int min, int max){
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i< length; i++){
            array.add(random.nextInt(max - min + 1) + min);
        }
        return array;
    }
}
