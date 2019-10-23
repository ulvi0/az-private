package Homeworks.hmw2;
import java.util.Random;
import java.util.Scanner;
public class Shooting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char [][] table = new char[6][23];

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 23; j++){
                if(j == 0) table[i][j] = (char) (i + 48);
                else if((j % 4 == 0) && (i == 0)) table[i][j] = (char) (j/4 + 48);
                else if(j % 4 == 0) table[i][j] = '-';
                else if(j % 4 == 2) table[i][j] = '|';
                else table[i][j] = ' ';
            }
        }
        int d = random.nextInt(2);
        int x, y;
        if(d == 0) {
            x = random.nextInt(3) + 1;
            y = random.nextInt(5) + 1;
        }
        else {
            x = random.nextInt(5) + 1;
            y = random.nextInt(3) + 1;
        }

        System.out.println("All set. Get ready to rumble!");
        int won = 0;
        while(true){
            System.out.println("Please, enter a line: ");

            int guess_x, guess_y;

            while(true) {
                if(!sc.hasNextInt()){
                    System.out.println("Please, enter a number..");
                    sc.next();
                    continue;
                }
                guess_x = sc.nextInt();
                if(guess_x <= 5 && guess_x >= 1) break;
                System.out.println("Please, enter a number in range [1 - 5]..");
            }

            System.out.println("Please, enter a shooting bar: ");

            while(true) {
                if(!sc.hasNextInt()){
                    System.out.println("Please, enter a number..");
                    sc.next();
                    continue;
                }
                guess_y = sc.nextInt();
                if(guess_y <= 5 && guess_y >= 1) break;
                System.out.println("Please, enter a number in range [1 - 5]..");
            }




            if((guess_x < x || guess_x > x + 2 || guess_y != y) && d == 0) {
                table[guess_x][guess_y * 4] = '*';
            }
            else if ((guess_y < y || guess_y > y + 2 || guess_x != x) && d == 1){
                table[guess_x][guess_y * 4] = '*';
            }
            else{
                if(table[guess_x][guess_y * 4] != 'x')won++;
                table[guess_x][guess_y * 4] = 'x';

            }

            System.out.println();
            for(int i = 0; i < 6; i++){
                for(int j = 0; j < 23; j++){
                    System.out.print(table[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            if(won == 3){
                System.out.println("You won!");
                break;
            }

        }

    }
}
