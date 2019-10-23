package Homeworks.hmw3;

import java.util.Scanner;

public class WeekPlanner {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String [][] schedule = new String [7][2];
        sched(schedule);

        System.out.println("Please, enter your name: ");
        String name = sc.next();
        while(true){
            System.out.println("Please, input the day of week: ");

            while(true) {
                String input = sc.next();
                input = input.toLowerCase();
                if(input.equals("exit")){
                    System.out.println("Bye, " + name + "!");
                    return;
                }
                boolean ch = false;
                if(input.equals("change")) {
                    ch = true;
                    input = sc.next();
                    input = input.toLowerCase();
                }
                int day = -1;
                for(int i = 0; i < 7; i++){
                    if(schedule[i][0].equals(input)) day = i;
                }
                if(day == -1) {
                    System.out.println("Sorry, I don't understand you, please try again.");
                    continue;
                }
                if(ch){
                    System.out.println("Please, enter new tasks: ");
                    sc.nextLine();
                    schedule[day][1] = sc.nextLine();
                    break;
                }
                System.out.println(schedule[day][1]);
                break;
            }


        }



    }

    public static void sched(String[][] schedule) {
        schedule[0][0] = "sunday";
        schedule[1][0] = "monday";
        schedule[2][0] = "tuesday";
        schedule[3][0] = "wednesday";
        schedule[4][0] = "thursday";
        schedule[5][0] = "friday";
        schedule[6][0] = "saturday";


        schedule[0][1] = "do home work";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][1] = "go to university";
        schedule[3][1] = "read articles";
        schedule[4][1] = "deadline of home work;";
        schedule[5][1] = "go to courses";
        schedule[6][1] = "meeting with friends";
    }


}
