package Homeworks.hmw6;

public class HappyFamily {
    enum DaysOfWeek {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(String[] args) throws Throwable {

        HappyFamily app =  new HappyFamily();
        Family Starks = app.CreateFamily();

        System.out.print("\n\n\n");
        System.out.println(Starks.toString());
        System.out.print("\n\n\n");

         Human ned = Starks.getFather();
        Human catelyn = Starks.getMother();
        Human [] children = Starks.getChildren();
        Human robb = children[3];
        Pet nymeria = Starks.getPet();



        //toString methods
        System.out.println(Starks.toString());
        System.out.println(nymeria.toString());
        System.out.println(robb.toString());

        //CountFamily
        System.out.println(Starks.getFather().getSurname() + "s family has " + Starks.countFamily() + " members.");


        //Calling Finalize Methods
        children = null;
        Starks.deleteChild(robb);
        robb = null;
        Starks.setPet(null);
        nymeria = null;
        int numberOfChildren = Starks.countChildren();
        for (int i = 0; i < numberOfChildren; i++) {
            Starks.deleteChild(0);
        }

        ned.setFamily(null);
        catelyn.setFamily(null);
        Starks = null;
        System.gc();

    }

    public static void CreateSchedule(String[][] schedule) {
        int i = 0;
        for (DaysOfWeek day : DaysOfWeek.values()) {
            schedule[i++][0] = day.name();
        }


        schedule[0][1] = "do home work";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][1] = "go to university";
        schedule[3][1] = "read articles";
        schedule[4][1] = "deadline of home work;";
        schedule[5][1] = "go to courses";
        schedule[6][1] = "meeting with friends";
    }

    public Family CreateFamily(){
        String[][] schedule = new String[7][2];
        CreateSchedule(schedule);


        String[] habits = new String[]{"eat", "play", "sleep"};

        Pet nymeria = new Pet(Pet.Species.Wolf, "Nymeria", 4, 56, habits);

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
        return Starks;
    }
}
