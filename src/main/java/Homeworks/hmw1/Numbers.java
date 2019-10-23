package Homeworks.hmw1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        String name = sc.next();

        System.out.println("Let The Game Begin!");

        Random random = new Random();
        int a = random.nextInt(101);
        int [] numbers = new int[500];
        int count = 0;
        System.out.println("Guess the number..");

        while(true){

            int guess;
            while(true) {
                if(!sc.hasNextInt()){
                    System.out.println("Please, enter a number..");
                    sc.next();
                    continue;
                }
                guess = sc.nextInt();
                if(guess <= 100 && guess >= 1) break;
                System.out.println("Please, enter a number in range [1 - 100]..");
            }
            numbers[count] = guess;
            count++;

            if(guess > a) System.out.println("Your number is too big. Please, try again..");
            else if(guess < a) System.out.println("Your number is too small. Please, try again..");
            else{
                System.out.println("Congratulations, " + name + "!");
                break;
            }

        }
        Arrays.sort(numbers, 0, count);
        System.out.println("Your numbers: ");
        for(int i = 0; i < count; i++){
            System.out.print(numbers[i]);
            System.out.print(' ');
        }

    }
}
