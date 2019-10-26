package Classworks.oct26.RandomString;

import java.util.ArrayList;
import Classworks.randomstring.RandomString;
public class CountCharacters {




    public static void main(String[] args) {
        RandomString random = new RandomString();
        String s = random.generateRandomString(100);
        ArrayList<Integer>[] occurrencesOfLetters = new ArrayList[26];
         for (int i = 0; i < 26; i++){
             occurrencesOfLetters[i] = new ArrayList<Integer>();
         }
        int[] numberOfOccurrences = new int[26];
        System.out.println("String: " + s);
        for(int i = 0;i < s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
             numberOfOccurrences[c - 'a']++;
             occurrencesOfLetters[c - 'a'].add(i + 1);
        }
        for(char c = 'a'; c <= 'z'; c++){
            if(numberOfOccurrences[c - 'a'] != 0)
                System.out.println(c + ": " + numberOfOccurrences[c - 'a'] + occurrencesOfLetters[c - 'a'].toString());
        }




    }
}
