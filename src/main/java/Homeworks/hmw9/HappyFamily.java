package Homeworks.hmw9;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HappyFamily {

    public static Map<DaysOfWeek, String> createSchedule() {
        Map<DaysOfWeek, String> schedule = new HashMap<>();
        schedule.put(DaysOfWeek.MONDAY, "do home work");
        schedule.put(DaysOfWeek.TUESDAY, "go to courses; watch a film"); ;
        schedule.put(DaysOfWeek.WEDNESDAY,  "go to university");
        schedule.put(DaysOfWeek.THURSDAY, "read articles");
        schedule.put(DaysOfWeek.FRIDAY, "deadline of home work");
        schedule.put(DaysOfWeek.SATURDAY, "go to courses");
        schedule.put(DaysOfWeek.SUNDAY, "meeting with friends");
        return schedule;
    }

    public Family createFamily() {
        Map<DaysOfWeek, String> schedule = createSchedule();



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
        Family Starks = app.createFamily();

        System.out.print("\n\n\n");
        System.out.println(Starks.toString());
        System.out.print("\n\n\n");

        System.out.println("Dog: ");
        Set<String> habits = new HashSet<String>() {{
            add("eat");
            add("play");
            add("sleep");
        }};
        Dog dog = new Dog("Nymeria", 4, 56, habits);
        Starks.addPet(dog);
        dog.response();
        dog.foul();
        System.out.println(dog.toString() + "\n");

        System.out.println("Cat: ");
        DomesticCat cat = new DomesticCat("Oscar", 2, 70, habits);
        cat.response();
        cat.foul();
        System.out.println(cat.toString() + "\n");

        System.out.println("Fish: ");
        habits = new HashSet<String>(){{
            add("Forget things");
        }};
        Fish fish = new Fish("Cleo", 2, 70, habits);
        fish.response();
        System.out.println(fish.toString() + "\n");


        System.out.println("Robocat: ");
        habits = new HashSet<String>(){{
            add("clean rooms");
            add("pass the butter");
            add("calculate radioactivity level");
        }};
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
