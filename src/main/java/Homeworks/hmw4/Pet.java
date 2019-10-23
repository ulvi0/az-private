package Homeworks.hmw4;

import java.util.Arrays;

public class Pet{
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
