package Homeworks.hmw4;


import java.util.Arrays;
import java.util.Random;

public class FamilyTree {

    public static void main(String[] args) {
        String [][] schedule = new String[7][2];
        sched(schedule);


        String [] habits = new String[] {"eat", "play", "sleep"};


        Pet nymeria = new Pet("Direwolf", "Nymeria", 4, 56, habits );
        Pet lady = new Pet("Direwolf", "Lady");
        Pet greywolf = new Pet();
        Pet summer = new Pet("Direwolf", "Summer");


        Human ned = new Human("Ned", "Stark", 263);
        Human catelyn = new Human("Catelyn", "Stark", 264);
        Human arya = new Human("Arya", "Stark", 289, 120, nymeria, ned, catelyn, schedule);
        Human sansa = new Human("Sansa", "Stark", 285, 100, lady, ned, catelyn, schedule);
        Human bran = new Human("Bran", "Stark", 288, 115, summer, ned, catelyn, schedule);
        Human robb = new Human("Robb", "Stark", 281, 118, greywolf, ned, catelyn, schedule);
        Human rickon = new Human();

        System.out.println("People in the family: ");
        System.out.println(ned.toString());
        System.out.println(catelyn.toString());
        System.out.println(arya.toString());
        System.out.println(sansa.toString());
        System.out.println(bran.toString());
        System.out.println(robb.toString());
        System.out.println(rickon.toString());
        System.out.println();

        System.out.println("Pets of the family: ");
        System.out.println(nymeria.toString());
        System.out.println(lady.toString());
        System.out.println(greywolf.toString());
        System.out.println(summer.toString());

        System.out.println();
        System.out.println();
        System.out.println("Child: ");


        arya.greetPet();
        arya.describePet();
        arya.feedPet(false);
        System.out.println();



        System.out.println("Pet: ");
        nymeria.response();
        nymeria.eat();
        nymeria.foul();

        arya.showSchedule();
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
