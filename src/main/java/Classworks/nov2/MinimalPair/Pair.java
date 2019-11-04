package Classworks.nov2.MinimalPair;

public class Pair {
    public int index;
    public int sum;

    public Pair(int index, int sum) {
        this.index = index;
        this.sum = sum;
    }
    public static Pair empty(){
        return new Pair(-1, Integer.MAX_VALUE);
    }
}
