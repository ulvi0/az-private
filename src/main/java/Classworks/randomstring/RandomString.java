package Classworks.randomstring;

import java.util.Random;
import java.util.Scanner;

public class RandomString {
    static Random  random = new Random();
    public String randomString(int length){
        String s = "";
        for(int i = 0; i< length; i++){
            boolean up = random.nextBoolean();
            int a = random.nextInt(26);
            if(up) s +=(char)(a + 65);
            else s+= (char) (a + 97);
        }
        return s;
    }

    public boolean Test(String s){
        if(s == null) return false;
        if(s.length() ==  0) return false;
        for(int i = 0; i < s.length(); i++){
            if(!Character.isAlphabetic(s.charAt(i))) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int n;
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the length of the array: ");
        n = sc.nextInt();
        String s;
        s = randomString(n);
        System.out.println(s);
        if(Test(s)) System.out.println("String is correct.");
        else System.out.println("String is not correct.");*/
    }
}
