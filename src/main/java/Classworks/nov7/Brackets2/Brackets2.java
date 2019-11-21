package Classworks.nov7.Brackets2;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.max;

public class Brackets2 {
    public boolean isAlpha(char c){
        return (c >= 'a' && c <='z') || (c >= 'A' && c <='Z');
    }

    public List<String> solution(String origin){
        List<String> strings = new ArrayList<>();
        int index;
        StringBuilder str_builder = new StringBuilder();
        int depth = 0;
        for(int i = 0; i < origin.length(); i++){
            char c = origin.charAt(i);
            while(isAlpha(c)){
                str_builder.append(c);
                c = origin.charAt(++i);
                if(!isAlpha(c)) {
                    strings.add(new String(str_builder));
                    str_builder = new StringBuilder();
                    break;
                }
            }

            switch (c){
                case '(': depth++; break;
                case ')': depth--; break;
                default: strings.add(new String(String.valueOf(c)));
            }
            if(depth < 0) throw new IllegalArgumentException("Extra Closing Bracket.");
        }
        if(depth > 0) throw new IllegalArgumentException("Extra Opening Bracket.");

        return strings;
    }
}
