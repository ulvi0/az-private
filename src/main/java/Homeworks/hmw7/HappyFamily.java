package Homeworks.hmw7;


public class HappyFamily {

    public static void createSchedule(String[][] schedule) {
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

    public Family CreateFamily() {
        String[][] schedule = new String[7][2];
        createSchedule(schedule);




        Man ned = new Man("Ned", "Stark", 263);
        Woman catelyn = new Woman("Catelyn", "Stark", 264);

        Family Starks = new Family(catelyn, ned);

        Human arya = new Woman("Arya", "Stark", 289, 120, schedule);
        Human sansa = new Woman("Sansa", "Stark", 285, 100, schedule);
        Human bran = new Man("Bran", "Stark", 288, 115, schedule);
        Human robb = new Man("Robb", "Stark", 281, 118, schedule);
        Human rickon = new Man();

        Starks.addChild(arya);
        Starks.addChild(sansa);
        Starks.addChild(bran);
        Starks.addChild(robb);
        Starks.addChild(rickon);
        return Starks;
    }

    public static void main(String[] args) throws Throwable {

        HappyFamily app = new HappyFamily();
        Family Starks = app.CreateFamily();

        System.out.print("\n\n\n");
        System.out.println(Starks.toString());
        System.out.print("\n\n\n");

        System.out.println("Dog: ");
        String[] habits = new String[]{"eat", "play", "sleep"};
        Dog dog = new Dog("Nymeria", 4, 56, habits);
        Starks.setPet(dog);
        dog.response();
        dog.foul();
        System.out.println(dog.toString()+ "\n");

        System.out.println("Cat: ");
        DomesticCat cat = new DomesticCat("Oscar", 2, 70, habits);
        cat.response();
        cat.foul();
        System.out.println(cat.toString()+ "\n");

        System.out.println("Fish: ");
        habits = new String[]{"Forget things"};
        Fish fish = new Fish("Cleo", 2, 70, habits);
        fish.response();
        System.out.println(fish.toString() + "\n");


        System.out.println("Robocat: ");
        habits = new String[]{"clean rooms", "pass the butter", "calculate radioactivity level"};
        RoboCat roboCat = new RoboCat("Max", 2, 70, habits);
        roboCat.response();
        System.out.println(roboCat.toString() + "\n\n");

        Man man = Starks.getFather();
        System.out.println("Man: ");
        man.greetPet();
        man.repairCar();
        System.out.println(man.toString() + "\n");



        Woman woman = Starks.getMother();
        System.out.println("Woman: ");
        woman.greetPet();
        woman.makeup();
        System.out.println(woman.toString() + "\n");


        System.out.println(Starks.bornChild().toString());
        System.out.println(Starks.bornChild().toString());


    }
}
