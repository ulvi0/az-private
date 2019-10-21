package Homeworks.hmw1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class homeWork1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        String name = sc.next();

        System.out.println("Let The Game Begin!");

        Random random = new Random();
        int a = random.nextInt(101);
        int [] numbers = new int[500];
        int cnt = 0;
        System.out.println("Guess the number..");

        while(true){

            int b;
            while(true) {
                if(!sc.hasNextInt()){
                    System.out.println("Please, enter a number..");
                    sc.next();
                    continue;
                }
                b = sc.nextInt();
                if(b <= 100 && b >= 1) break;
                System.out.println("Please, enter a number in range [1 - 100]..");
            }
            numbers[cnt] = b;
            cnt++;

            if(b > a) System.out.println("Your number is too big. Please, try again..");
            else if(b < a) System.out.println("Your number is too small. Please, try again..");
            else{
                System.out.println("Congratulations, " + name + "!");
                break;
            }

        }
        Arrays.sort(numbers, 0, cnt);
        System.out.println("Your numbers: ");
        for(int i = 0; i < cnt; i++){
            System.out.print(numbers[i]);
            System.out.print(' ');
        }

    }
}
