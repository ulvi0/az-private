package Classworks.nov5.paranthesises;
import static java.lang.Integer.max;

public class Brackets {
    public int calc(String s){
        int max_nested_level = 0;
        int nested_level = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch (c){
                case '(': nested_level++; break;
                case ')': nested_level--; break;
                default: throw new IllegalArgumentException("Wrong character.");
            }
            max_nested_level = max(nested_level, max_nested_level);
            if(nested_level < 0) throw new IllegalArgumentException("Extra Closing Bracket.");
        }
        if(nested_level > 0) throw new IllegalArgumentException("Extra Opening Bracket.");
        return max_nested_level;
    }


}
