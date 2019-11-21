package Classworks.nov21;

import java.util.List;

public class Solution {
    public List<Integer> process(List<Integer> origin){
        int last_neg = 0;
        int first = 0;
        for (int i = 0; i < origin.size(); i++) {
            int current = origin.get(i);
            if(current < 0){
                if(last_neg == 0) first = i;
                origin.set(i, last_neg);
                last_neg = current;
            }
        }
        origin.set(first, last_neg);
        return origin;
    }
}
