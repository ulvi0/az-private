package Classworks.oct26.Iterator;

import java.util.*;


public class HiddenData implements Iterable<String> {
    private final List<String>  months = Arrays.asList(
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");

    public Iterator<String> iterator(){
        List<Integer> RandomPermutation = new ArrayList<Integer>();
        for(int i = 0; i < months.size(); i++) RandomPermutation.add(i);
        Collections.shuffle(RandomPermutation);


        Iterator<String> iterator = new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < RandomPermutation.size();
            }

            @Override
            public String next() {
                return months.get(RandomPermutation.get(index++));
            }
        };
        return iterator;
    }



}
