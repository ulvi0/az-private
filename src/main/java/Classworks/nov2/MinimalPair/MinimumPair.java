package Classworks.nov2.MinimalPair;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumPair {

    public static void main(String[] args) {
        RandomArray randomArray = new RandomArray();
        ArrayList<Integer> array = randomArray.generateRandomArray(30, 0, 100);
        System.out.println(array);

        Pair minPair = IntStream
                .range(0, 30 - 1)
                .mapToObj(i -> new Pair (i, array.get(i) + array.get(i + 1)))
                .min((first, second) ->  (first.sum - second.sum)).orElse(Pair.empty());

        int index1 = minPair.index;
        int index2 = minPair.index + 1;
        System.out.println("Sum: " + minPair.sum);
        System.out.println(String.format("First: %d Second: %d", index1, index2));


    }
}
