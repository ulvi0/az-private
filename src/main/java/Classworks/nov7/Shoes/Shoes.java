package Classworks.nov7.Shoes;

import java.util.Stack;

public class Shoes {
    public int solution(String S){
        int counter = 0;
        int answer = 0;
        for(int i = 0 ; i < S.length(); i++){
            char c = S.charAt(i);
            switch (c){
                case 'R': counter++; break;
                case 'L': counter--; break;
                default: throw new IllegalArgumentException("Wrong character.");
            }
            if(counter == 0) answer++;
        }
        if(counter > 0) throw new IllegalArgumentException("Extra R character.");
        if(counter < 0) throw new IllegalArgumentException("Extra L character.");
        return answer;
    }
}
