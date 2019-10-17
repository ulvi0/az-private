import java.util.Random;

public class RandomNmbers {
    public static void main(String[] args) {
        Random random = new Random();
        int [] a = new int[10];
        System.out.print("Random Numbers: ");
        for(int i = 0; i< 10; i++){
            a[i] = random.nextInt(11) + 10;
            System.out.print(a[i]);
            if(i < 9) System.out.print(", ");
        }
    }
}
