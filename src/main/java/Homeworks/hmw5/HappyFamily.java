package Homeworks.hmw5;




public class HappyFamily {

    public static void main(String[] args) {
        String [][] schedule = new String[7][2];
        sched(schedule);


        String [] habits = new String[] {"eat", "play", "sleep"};

        Pet nymeria = new Pet("Direwolf", "Nymeria", 4, 56, habits );

        Human ned = new Human("Ned", "Stark", 263);
        Human catelyn = new Human("Catelyn", "Stark", 264);

        Family Starks = new Family(ned, catelyn);

        Human arya = new Human("Arya", "Stark", 289, 120, schedule);
        Human sansa = new Human("Sansa", "Stark", 285, 100, schedule);
        Human bran = new Human("Bran", "Stark", 288, 115, schedule);
        Human robb = new Human("Robb", "Stark", 281, 118, schedule);
        Human rickon = new Human();

        Starks.addChild(arya);
        Starks.addChild(sansa);
        Starks.addChild(bran);
        Starks.addChild(robb);
        Starks.addChild(rickon);
        Starks.setPet(nymeria);

        System.out.print("\n\n\n");
        System.out.println(Starks.toString());
        System.out.print("\n\n\n");



        Starks.deleteChild(3);
        System.out.println(Starks.toString());
        System.out.print("\n\n\n");

        Starks.deleteChild(bran);
        System.out.println(Starks.toString());
        System.out.print("\n\n\n");

        System.out.println("Child: ");
        arya.greetPet();
        arya.describePet();
        arya.feedPet(false);
        System.out.print("\n\n\n");



        System.out.println("Pet: ");
        nymeria.response();
        nymeria.eat();
        nymeria.foul();

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
