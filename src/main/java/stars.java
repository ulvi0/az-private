import java.util.Scanner;

public class stars {
    public static void main(String[] args) {
        char c;
        int h, w;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");

        h = sc.nextInt();

        System.out.print("Enter width: ");
        w = sc.nextInt();
        for(int i = 1; i <= h; i++){
            for(int j = 1; j<= w; j++){
                if(i == 1 || j == 1 || i == h || j == w) c = '*';
                else if((i == j * (h / w) || i == (w - j + 1) * (h / w) )&& h > w) c = '*';
                else if((j == i * (w / h) || j == (h - i + 1) * (w / h) )&& h <= w) c = '*';
                else c = ' ';
                System.out.print(c );
                System.out.print(' ');
            }
            System.out.println();
        }

    }

}
