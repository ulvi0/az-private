import java.util.Arrays;
import java.util.Random;

public class reversedRandomNumbers {
    public  static int[] filter_negatives(int[] origin){
        int [] result = new int[origin.length];
        int pos = 0;
        for(int v: origin){
            if(v < 0) result[pos++] = v;
        }
        if(pos == origin.length) return result;
        return Arrays.copyOf(result, pos);
    }
    public  static int[] filter_odd(int[] origin){
        int [] result = new int[origin.length];
        int pos = 0;
        for(int v: origin){
            if(v > 0 && v % 2 == 1) result[pos++] = v;
        }
        if(pos == origin.length) return result;
        return Arrays.copyOf(result, pos);
    }
    public  static int[] filter_even(int[] origin){
        int [] result = new int[origin.length];
        int pos = 0;
        for(int v: origin){
            if(v > 0 && v % 2 == 0) result[pos++] = v;
        }
        if(pos == origin.length) return result;
        return Arrays.copyOf(result, pos);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int n = 20;
        int max = 10;
        int min = -10;
        int [] a= new int[n];

        for(int i = 0; i< n; i++){
            a[i] = random.nextInt(max - min + 1) + min;
        }
        System.out.print("Random numbers: ");
        System.out.println(Arrays.toString(a));

        for(int i = 0; i <= (n - 1)/2; i++){
            a[i] += a[n - 1 - i];
            a[n - i - 1] = a[i] - a[n - i - 1];
            a[i] = a[i] - a[n - 1 - i];
        }

        System.out.print("Random numbers in reversed order: ");
        System.out.println(Arrays.toString(a));

        int [] result;

        System.out.print("Negative numbers: ");
        result = filter_negatives(a);
        System.out.println(Arrays.toString(result));

        System.out.print("Positive odd numbers: ");
        result = filter_odd(a);
        System.out.println(Arrays.toString(result));

        System.out.print("Positive even numbers: ");
        result = filter_even(a);
        System.out.println(Arrays.toString(result));

    }
}
