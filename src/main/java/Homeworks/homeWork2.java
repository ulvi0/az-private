package Homeworks;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class homeWork2 {
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

            int a, b;

            while(true) {
                if(!sc.hasNextInt()){
                    System.out.println("Please, enter a number..");
                    sc.next();
                    continue;
                }
                a = sc.nextInt();
                if(a <= 5 && a >= 1) break;
                System.out.println("Please, enter a number in range [1 - 5]..");
            }

            System.out.println("Please, enter a shooting bar: ");

            while(true) {
                if(!sc.hasNextInt()){
                    System.out.println("Please, enter a number..");
                    sc.next();
                    continue;
                }
                b = sc.nextInt();
                if(b <= 5 && b >= 1) break;
                System.out.println("Please, enter a number in range [1 - 5]..");
            }




            if((a < x || a > x + 2 || b != y) && d == 0) {
                table[a][b * 4] = '*';
            }
            else if ((b < y || b > y + 2 || a != x) && d == 1){
                table[a][b * 4] = '*';
            }
            else{
                if(table[a][b * 4] != 'x')won++;
                table[a][b * 4] = 'x';

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
