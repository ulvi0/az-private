package Homeworks.hmw3;

import java.util.Scanner;

public class weekPlanner {

    public static void main(String[] args) {
        String [][] schedule = new String [7][2];
        Scanner sc = new Scanner(System.in);
        schedule[0][0] = "Sunday";
        schedule[1][0] = "Monday";
        schedule[2][0] = "Tuesday";
        schedule[3][0] = "Wednesday";
        schedule[4][0] = "Thursday";
        schedule[5][0] = "Friday";
        schedule[6][0] = "Saturday";


        schedule[0][1] = "do home work";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][1] = "go to university";
        schedule[3][1] = "go to courses; read articles";
        schedule[4][1] = "deadline of home work;";
        schedule[5][1] = "go to courses";
        schedule[6][1] = "meeting with friends";


        while(true){
            System.out.print("Please, input the day of week: ");

            String input = sc.next();
            if(input == "exit") break;

            for(int i = 0 ; i < 7; i++){
                if(schedule[i][0] == input){
                    System.out.println(schedule[i][1]);
                }
            }
        }



    }


}
