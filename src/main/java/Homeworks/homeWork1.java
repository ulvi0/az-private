package Homeworks;
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

        System.out.println("Guess the number.");

        while(true){
            int b = sc.nextInt();
            if(b > a) System.out.println("Your number is too big. Please, try again..");
            else if(b < a) System.out.println("Your number is too small. Please, try again..");
            else{
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
}
