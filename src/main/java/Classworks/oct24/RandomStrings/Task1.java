package Classworks.oct24.RandomStrings;

import java.util.Random;

public class Task1 {
        public String generate_Strings(int length) {
            Random random = new Random();
            String origin = new String();
            char [] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
            char [] consonants = new char[21];
            int j = 0;
            for(char i = 'a'; i <= 'z'; i++){
                if(i != 'a' && i != 'e' && i!= 'i' && i!= 'o' && i!= 'u'){
                    consonants[j++] = i;
                }
            }
            for(int i = 0; i < length; i++){
                origin += vowels[random.nextInt(5)];
            }
            for(int i = 0; i < length; i++){
                origin += Character.toUpperCase(vowels[random.nextInt(5)]);
            }
            for(int i = 0; i < length; i++){
                origin += consonants[random.nextInt(21)];
            }
            for(int i = 0; i < length; i++){
                origin += Character.toUpperCase(consonants[random.nextInt(21)]);
            }
            return origin;


        }

}
