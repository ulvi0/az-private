package Homeworks.hmw9;

import java.util.Set;

public class Dog extends Pet {

    {
        setSpecies(Species.DOG);
    }

    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void response() {
        System.out.printf("Woof-woof, I am %s. I miss you!\n", getNickname());
    }

    public void foul() {
        System.out.println("I need to cover this up, woof-woof!\n");
    }


}
