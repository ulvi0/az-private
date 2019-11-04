package Classworks.nov2.Files;

import java.util.ArrayList;
import java.util.Random;

import Classworks.randomstring.RandomString;
public class RandomStrings {
    ArrayList<String> create(int length, int min, int max){
        RandomString randomString = new RandomString();
        Random random = new Random();
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int i = 0 ; i < length; i++){
            int randomLength = random.nextInt(max  - min + 1) + min;
            arrayList.add(randomString.generateRandomString(randomLength).toUpperCase());
        }
        return arrayList;
    }
}
