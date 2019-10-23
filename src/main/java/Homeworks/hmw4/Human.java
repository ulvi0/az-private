package Homeworks.hmw4;

import java.util.Random;

public class Human{
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
        System.out.println("I have a " + this.pet.species + ", she is " + this.pet.age + " years old, she is " +
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