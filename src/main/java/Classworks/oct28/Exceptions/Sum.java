package Classworks.oct28.Exceptions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Sum {


    public static void main(String[] args) {

        Optional <String> o1 = Optional.of("sss");

        Sum app = new Sum();
        String string = new String("1 3 kjks3 idj2  a aa aaa b a b ds 2 3 -6");
        String [] arrOfString = string.split(" ");
        ArrayList<String> arrayList= new ArrayList<String>();
        int count = 0;
        for (String S: arrOfString) {
            try {
                Integer.parseInt(S);
            }
            catch (NumberFormatException ex) {
                arrayList.add(S);
                count++;
            }
        }
        System.out.println(count);
        System.out.println(arrayList.toString());
    }
}
