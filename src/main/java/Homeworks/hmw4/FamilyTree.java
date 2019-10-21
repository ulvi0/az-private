package Homeworks.hmw4;

import Homeworks.hmw3.weekPlanner;

import java.util.Arrays;
import java.util.Random;

public class FamilyTree {
    public static class Pet{
        String species;
        String nickname;
        int age;
        int trickLevel;

        public Pet() {
        }

        public Pet(String species, String nickname) {
            this.species = species;
            this.nickname = nickname;
        }

        public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
            this.species = species;
            this.nickname = nickname;
            this.age = age;
            this.trickLevel = trickLevel;
            this.habits = habits;
        }

        String [] habits;

        public void eat(){
            System.out.println("I am eating.");
        }
        public void response(){
            System.out.println("Hello, owner. I am -" + this.nickname + ". I miss you!");
        }
        public void foul(){
            System.out.println("I need to cover it up.");
        }

        @Override
        public String toString() {
            return species + "{" +
                    ((nickname != null)?("nickname='" + nickname + '\''):"") +
                    ((age != 0)?(", age=" + age):"") +
                    ((trickLevel != 0)?(", trickLevel=" + trickLevel):"") +
                    ((habits != null)?(", habits=" + Arrays.toString(habits)):"") +
                    '}';
        }
    }

    public static class Human{
        String name;
        String surname;
        int year;
        int iq;
        Pet pet;
        Human mother;
        Human father;
        String [][] schedule;
        public Human() {
        }

        public Human(String name, String surname, int year) {
            this.name = name;
            this.surname = surname;
            this.year = year;
        }

        public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
            this.name = name;
            this.surname = surname;
            this.year = year;
            this.iq = iq;
            this.pet = pet;
            this.mother = mother;
            this.father = father;
            this.schedule = schedule;
        }
        public void greetPet(){
            System.out.println("Hello, " + this.pet.nickname + "!");
        }
        public void  describePet(){
            System.out.println("I have a " + this.pet.species + ", she is " + Integer.toString(this.pet.age) + " years old, she is " +
                    ( (this.pet.trickLevel > 50) ? "very sly." : "almost not sly."));
        }

        @Override
        public String toString() {
            return "Human{" +
                    ((name != null)? ("name='" + name + '\''):"") +
                    ((surname != null)? (", surname='" + surname + '\''):"") +
                    ((year != 0)? (", year=" + year):"") +
                    ((iq != 0)? (", iq=" + iq ):"")+
                    ((mother != null)? (", mother='" + mother.name + ' ' + mother.surname + '\''):"") +
                    ((father != null)? (", father='" + father.name + ' ' + father.surname + '\''):"") +
                    ((pet != null)? (", pet=" + pet.toString()):"") +
                    '}';
        }

        public boolean feedPet(boolean b){
            System.out.println("Isn't it time for feeding??");
            Random random = new Random();
            int r = random.nextInt();
            if(b || r <= pet.trickLevel ){
                System.out.println("Hm... I will feed " + pet.nickname + ".");
                System.out.print(pet.nickname + ": ");
                pet.eat();
                return true;
            }
            System.out.println("I think " + pet.nickname + " is not hungry.");
            return false;
        }

        public void showSchedule(){
            System.out.println();
            System.out.println("Schedule of the " + name + ": ");
            for(int i = 0; i < 7; i++){
                System.out.println(schedule[i][0] + ": " + schedule[i][1]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        String [][] schedule = new String[7][2];
        weekPlanner.sched(schedule);


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


}
